package br.com.rfasioli.pocnosqlcase1mod4.events.messaging;

import br.com.rfasioli.extendedmessaging.ExtendedMessagingImpl;
import br.com.rfasioli.extendedmessaging.IExtendedMessaging;
import br.com.rfasioli.extendedmessaging.interfaces.dtos.ExtendedMessageDTO;
import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.RemotelyInspectionEXTDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;

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

        //Objeto comum
        String serialized = messagingMapper.serialize(content);
        RemotelyInspectionEXTDTO deserialized = messagingMapper.deserialize(serialized, RemotelyInspectionEXTDTO.class);

        // Objeto aninhado
        ExtendedMessageDTO content2 = ExtendedMessageDTO.of(content);
        String serialized2 = messagingMapper.serialize(content2);
        ExtendedMessageDTO deserialized2 = messagingMapper.deserialize(serialized2, ExtendedMessageDTO.class);

        // Rebuild
        String serializedData = messagingMapper.serialize((Serializable) deserialized2.getContent().get());
        RemotelyInspectionEXTDTO deserialized3 = messagingMapper.deserialize(serializedData, RemotelyInspectionEXTDTO.class);

        this.extendedMessager.sendMessage(content);
    }

    @Override
    public RemotelyInspectionEXTDTO parseReceiveMessage(String message) {
        return this.extendedMessager.parseReceiveMessage(message);
    }
}
