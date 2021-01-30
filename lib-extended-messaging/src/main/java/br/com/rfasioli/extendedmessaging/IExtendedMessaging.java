package br.com.rfasioli.extendedmessaging;

import java.io.Serializable;

public interface IExtendedMessaging<O extends Serializable, S extends String, K extends String> {
    void sendMessage(O content);
    O parseReceiveMessage(S message);
}
