package br.com.rfasioli.pocnosqlcase1mod2.exceptions;

public class CacheNotFoundException extends RuntimeException {
    public CacheNotFoundException() {
        super();
    }
    public CacheNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public CacheNotFoundException(String message) {
        super(message);
    }
    public CacheNotFoundException(Throwable cause) {
        super(cause);
    }
}