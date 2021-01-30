package br.com.rfasioli.pocnosqlcase1mod5.events.messaging;

import br.com.rfasioli.extendedmessaging.interfaces.IExtendedMessagingMapper;
import br.com.rfasioli.pocnosqlcase1mod5.events.messaging.exceptions.ExtendedMessagingImplException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class MessagingMapperImpl implements IExtendedMessagingMapper<String> {
    private final ObjectMapper objectMapper;

    public MessagingMapperImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public <O extends Serializable> String serialize(O object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException ex) {
            throw new ExtendedMessagingImplException("Erro serializando objeto, veja exceção aninhada.", ex);
        }
    }

    @Override
    public <O extends Serializable> O deserialize(String serialized, Class<O> type) {
        try {
            return objectMapper.readValue(serialized, type);
        } catch (JsonProcessingException ex) {
            throw new ExtendedMessagingImplException("Erro desserializando objeto, veja exceção aninhada.", ex);
        }
    }
}
