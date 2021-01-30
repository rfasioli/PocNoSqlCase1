package br.com.rfasioli.pocnosqlcase1mod5.events.messaging;

import br.com.rfasioli.extendedmessaging.ExtendedMessagingImpl;
import br.com.rfasioli.extendedmessaging.IExtendedMessaging;
import br.com.rfasioli.pocnosqlcase1mod5.events.dtos.remotelyinspectionext.RemotelyInspectionEXTDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExtendedMessagingRIAdapter implements IExtendedMessaging<RemotelyInspectionEXTDTO, String, String> {
    private static Logger logger = LoggerFactory.getLogger(ExtendedMessagingRIAdapter.class);

    private final JMSMessageSenderRIImpl jmsMessageSender;
    private final MessagingMapperImpl messagingMapper;
    private final RedisMessageCacheImpl messageCache;
    private final ExtendedMessagingImpl<RemotelyInspectionEXTDTO, String, String> extendedMessager;

    public ExtendedMessagingRIAdapter(JMSMessageSenderRIImpl jmsMessageSender,
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
                RemotelyInspectionEXTDTO.class);

    }

    @Override
    public void sendMessage(RemotelyInspectionEXTDTO content) {
        this.extendedMessager.sendMessage(content);
    }

    @Override
    public RemotelyInspectionEXTDTO parseReceiveMessage(String message) {
        return this.extendedMessager.parseReceiveMessage(message);
    }
}
