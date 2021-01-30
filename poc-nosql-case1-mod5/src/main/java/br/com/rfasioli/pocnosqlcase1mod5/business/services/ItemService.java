package br.com.rfasioli.pocnosqlcase1mod5.business.services;

import br.com.rfasioli.pocnosqlcase1mod5.business.domains.Item;
import br.com.rfasioli.pocnosqlcase1mod5.events.listeners.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private static Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);

    public void process(Item item) {
        LOGGER.info(String.format("Item Recebido: %s", item));
    }
}