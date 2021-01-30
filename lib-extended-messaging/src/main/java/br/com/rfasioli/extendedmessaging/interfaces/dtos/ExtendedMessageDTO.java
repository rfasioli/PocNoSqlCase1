package br.com.rfasioli.extendedmessaging.interfaces.dtos;

import java.io.Serializable;
import java.util.Optional;

public class ExtendedMessageDTO<K extends String, S extends Serializable> implements Serializable {
    private K id;
    private S content;

    public Optional<K> getId() {
        return Optional.ofNullable(id);
    }

    public void setId(K id) {
        this.id = id;
    }

    public Optional<S> getContent() {
        return Optional.ofNullable(content);
    }

    public void setContent(S content) {
        this.content = content;
    }

    public ExtendedMessageDTO() {
    }

    private ExtendedMessageDTO(K id) {
        this.id = id;
    }

    private ExtendedMessageDTO(S content) {
        this.content = content;
    }

    public static ExtendedMessageDTO of(String id) {
        return new ExtendedMessageDTO(id);
    }

    public static ExtendedMessageDTO of(Serializable content) {
        return new ExtendedMessageDTO(content);
    }

}
