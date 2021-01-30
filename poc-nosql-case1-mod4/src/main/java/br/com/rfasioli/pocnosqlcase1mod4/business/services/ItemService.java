package br.com.rfasioli.pocnosqlcase1mod4.business.services;

import br.com.rfasioli.pocnosqlcase1mod4.business.domains.Item;
import br.com.rfasioli.pocnosqlcase1mod4.events.messaging.ExtendedMessagingAdapter;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private static Logger logger = LoggerFactory.getLogger(ItemService.class);

    private final ExtendedMessagingAdapter extendedMessagingAdapter;

    public ItemService(ExtendedMessagingAdapter extendedMessagingAdapter) {
        this.extendedMessagingAdapter = extendedMessagingAdapter;
    }

    public void process(Item item) throws JsonProcessingException {
        this.extendedMessagingAdapter.sendMessage(item);
    }

}
