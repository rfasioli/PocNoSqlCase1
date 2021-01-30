package br.com.rfasioli.extendedmessaging.exceptions;

public class ExtendedMessagingException extends RuntimeException {
    public ExtendedMessagingException() {
        super();
    }

    public ExtendedMessagingException(String s) {
        super(s);
    }

    public ExtendedMessagingException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ExtendedMessagingException(Throwable throwable) {
        super(throwable);
    }

    protected ExtendedMessagingException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
