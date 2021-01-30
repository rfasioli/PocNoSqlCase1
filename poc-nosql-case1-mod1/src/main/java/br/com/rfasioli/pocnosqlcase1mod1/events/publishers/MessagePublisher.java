package br.com.rfasioli.pocnosqlcase1mod1.events.publishers;

import br.com.rfasioli.pocnosqlcase1mod1.interfaces.dtos.ContractDTO;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MessagePublisher {
    private final JmsTemplate jmsTemplate;

    public MessagePublisher(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void publish(String contentId) {
        this.jmsTemplate.convertAndSend("module3",
                new ContractDTO(UUID.fromString(contentId), "module1"));
    }

}
