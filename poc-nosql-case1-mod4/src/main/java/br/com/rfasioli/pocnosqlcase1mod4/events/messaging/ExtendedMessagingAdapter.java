package br.com.rfasioli.pocnosqlcase1mod4.events.messaging;

import br.com.rfasioli.extendedmessaging.ExtendedMessagingImpl;
import br.com.rfasioli.extendedmessaging.IExtendedMessaging;
import br.com.rfasioli.pocnosqlcase1mod4.business.domains.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExtendedMessagingAdapter implements IExtendedMessaging<Item, String, String> {
    private static Logger logger = LoggerFactory.getLogger(ExtendedMessagingAdapter.class);

    private final JMSMessageSenderImpl jmsMessageSender;
    private final MessagingMapperImpl messagingMapper;
    private final RedisMessageCacheImpl messageCache;
    private final ExtendedMessagingImpl<Item, String, String> extendedMessager;

    public ExtendedMessagingAdapter(JMSMessageSenderImpl jmsMessageSender,
                                    MessagingMapperImpl messagingMapper,
                                    RedisMessageCacheImpl messageCache) {
        this.jmsMessageSender = jmsMessageSender;
        this.messagingMapper = messagingMapper;
        this.messageCache = messageCache;

        this.extendedMessager = new ExtendedMessagingImpl<>(
                jmsMessageSender,
                messageCache,
                messagingMapper,
                messagingMapper,
                Item.class);

    }

    @Override
    public void sendMessage(Item content) {
        this.extendedMessager.sendMessage(content);
    }

    @Override
    public Item parseReceiveMessage(String message) {
        return this.extendedMessager.parseReceiveMessage(message);
    }
}
