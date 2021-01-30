package br.com.rfasioli.extendedmessaging.interfaces;

import java.io.Serializable;

public interface IExtendedMessagingMapper<S extends String> {
    <O extends Serializable> S serialize(O object);
    <O extends Serializable> O deserialize(S serialized, Class<O> type);
}
