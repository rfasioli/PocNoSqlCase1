package br.com.rfasioli.extendedmessaging.interfaces;

public interface IExtendedMessagingSender<S> {
    void send(S contentId);
    long getMessageMaxSize();
}
