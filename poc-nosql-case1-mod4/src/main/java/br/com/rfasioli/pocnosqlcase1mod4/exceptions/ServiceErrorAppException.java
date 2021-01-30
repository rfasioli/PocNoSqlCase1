package br.com.rfasioli.pocnosqlcase1mod4.exceptions;

public class ServiceErrorAppException extends RuntimeException{
    public ServiceErrorAppException() {
        super();
    }
    public ServiceErrorAppException(String message, Throwable cause) {
        super(message, cause);
    }
    public ServiceErrorAppException(String message) {
        super(message);
    }
    public ServiceErrorAppException(Throwable cause) {
        super(cause);
    }
}
