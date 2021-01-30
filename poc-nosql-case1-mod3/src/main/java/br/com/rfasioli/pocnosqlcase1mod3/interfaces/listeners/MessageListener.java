package br.com.rfasioli.pocnosqlcase1mod3.interfaces.listeners;

import br.com.rfasioli.pocnosqlcase1mod3.business.services.ItemService;
import br.com.rfasioli.pocnosqlcase1mod3.exceptions.CacheNotFoundException;
import br.com.rfasioli.pocnosqlcase1mod3.interfaces.dtos.ContractDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    private static Logger logger = LoggerFactory.getLogger(ItemService.class);

    private final ItemService itemService;
    private final JmsTemplate jmsTemplate;

    public MessageListener(ItemService itemService,
                           JmsTemplate jmsTemplate) {
        this.itemService = itemService;
        this.jmsTemplate = jmsTemplate;
    }

    @JmsListener(destination = "module3", containerFactory = "myFactory")
    public void receiveMessage(ContractDTO contract) {
        logger.info(String.format("Received <{%s}>:", contract));
        try {
            itemService.process(contract.getContentId().toString());
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        } catch (CacheNotFoundException e) {
            jmsTemplate.convertAndSend(contract.getRepliesTo(), contract);
        }
    }

}
