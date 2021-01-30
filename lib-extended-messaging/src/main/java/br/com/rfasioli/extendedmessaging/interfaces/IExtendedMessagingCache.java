package br.com.rfasioli.extendedmessaging.interfaces;

public interface IExtendedMessagingCache<S extends String, K extends String> {
    K save(S content);
    S get(K id);
}
