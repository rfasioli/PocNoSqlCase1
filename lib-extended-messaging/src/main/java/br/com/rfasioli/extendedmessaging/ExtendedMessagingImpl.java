package br.com.rfasioli.extendedmessaging;

import br.com.rfasioli.extendedmessaging.interfaces.IExtendedMessagingCache;
import br.com.rfasioli.extendedmessaging.interfaces.IExtendedMessagingMapper;
import br.com.rfasioli.extendedmessaging.interfaces.IExtendedMessagingSender;
import br.com.rfasioli.extendedmessaging.interfaces.dtos.ExtendedMessageDTO;

import java.io.Serializable;

public class ExtendedMessagingImpl<O extends Serializable, S extends String, K extends String>
        implements IExtendedMessaging<O, S, K>
{
    private final IExtendedMessagingSender<S> sender;
    private final IExtendedMessagingCache<S, K> cache;
    private final IExtendedMessagingMapper<S> mapper;
    private final IExtendedMessagingMapper<S> extendedMapper;
    private final Class<O> type;

    public ExtendedMessagingImpl(IExtendedMessagingSender sender,
                                 IExtendedMessagingCache cache,
                                 IExtendedMessagingMapper<S> mapper,
                                 IExtendedMessagingMapper<S> extendedMapper,
                                 Class<O> type) {
        this.sender = sender;
        this.cache = cache;
        this.mapper = mapper;
        this.extendedMapper = extendedMapper;
        this.type = type;
    }

    public void sendMessage(O content) {
        S serializedMessage = (S)extendedMapper.<ExtendedMessageDTO>serialize(ExtendedMessageDTO.of(content));

        if (serializedMessage.length() > sender.getMessageMaxSize()) {
            S serializedContent = mapper.<O>serialize(content);
            String id = cache.save(serializedContent);
            serializedMessage = (S) extendedMapper.<ExtendedMessageDTO>serialize(ExtendedMessageDTO.of(id));
        }
        sender.send(serializedMessage);
    }

    public O parseReceiveMessage(S message) {
        ExtendedMessageDTO extMsg = extendedMapper.<ExtendedMessageDTO>deserialize(message, ExtendedMessageDTO.class);

        return extMsg.getContent().isPresent() ?
                rebuildContent(extMsg.getContent().get()):
                extMsg.getId().isPresent() ?
                        recoverContent((K)extMsg.getId().get()): null;
    }

    private O rebuildContent(Object map) {
        S serializedData = extendedMapper.serialize((Serializable) map);
        return mapper.<O>deserialize(serializedData, type);
    }

    private O recoverContent(K id) {
        S cachedData = cache.get(id);
        return mapper.<O>deserialize(cachedData, type);
    }

}
