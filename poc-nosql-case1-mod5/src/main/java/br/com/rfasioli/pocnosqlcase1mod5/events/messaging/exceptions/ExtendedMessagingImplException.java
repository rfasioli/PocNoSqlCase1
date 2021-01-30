package br.com.rfasioli.pocnosqlcase1mod5.events.messaging.exceptions;

public class ExtendedMessagingImplException extends RuntimeException {
    public ExtendedMessagingImplException() {
        super();
    }

    public ExtendedMessagingImplException(String s) {
        super(s);
    }

    public ExtendedMessagingImplException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ExtendedMessagingImplException(Throwable throwable) {
        super(throwable);
    }

    protected ExtendedMessagingImplException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
