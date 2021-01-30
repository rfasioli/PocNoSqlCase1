package br.com.rfasioli.pocnosqlcase1mod5.events.listeners;

import br.com.rfasioli.pocnosqlcase1mod5.business.domains.Item;
import br.com.rfasioli.pocnosqlcase1mod5.business.services.ItemService;
import br.com.rfasioli.pocnosqlcase1mod5.events.dtos.remotelyinspectionext.RemotelyInspectionEXTDTO;
import br.com.rfasioli.pocnosqlcase1mod5.events.messaging.ExtendedMessagingAdapter;
import br.com.rfasioli.pocnosqlcase1mod5.events.messaging.ExtendedMessagingRIAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    private static Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);

    private final ExtendedMessagingAdapter extendedMessagingAdapter;
    private final ExtendedMessagingRIAdapter extendedMessagingRIAdapter;
    private final ItemService itemService;

    public MessageListener(ExtendedMessagingAdapter extendedMessagingAdapter, ExtendedMessagingRIAdapter extendedMessagingRIAdapter, ItemService itemService) {
        this.extendedMessagingAdapter = extendedMessagingAdapter;
        this.extendedMessagingRIAdapter = extendedMessagingRIAdapter;
        this.itemService = itemService;
    }

    @JmsListener(destination = "${spring.jms.queue.name}", containerFactory = "myFactory")
    public void receiveMessage(String contract) {
        LOGGER.info(String.format("Received: %s", contract));
        Item item = this.extendedMessagingAdapter.parseReceiveMessage(contract);
        itemService.process(item);
    }

    @JmsListener(destination = "${spring.jms.queue.ri.name}", containerFactory = "myFactory")
    public void receiveRIMessage(String contract) {
        LOGGER.info(String.format("Received: %s", contract));
        RemotelyInspectionEXTDTO remotelyInspectionEXTDTO =
                this.extendedMessagingRIAdapter.parseReceiveMessage(contract);
//        itemService.process(item);
    }
}
