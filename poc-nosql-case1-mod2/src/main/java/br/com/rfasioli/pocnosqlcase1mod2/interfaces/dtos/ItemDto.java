package br.com.rfasioli.pocnosqlcase1mod2.interfaces.dtos;

import br.com.rfasioli.pocnosqlcase1mod2.enums.STATUS;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDto {
    @JsonProperty(required = false)
    private UUID id;

    @JsonProperty(required = true)
    private String description;

    @JsonProperty(value = "created_at", required = false)
    private LocalDateTime createdAt;

    @JsonProperty(required = false)
    private STATUS status;

    public ItemDto() {
    }

    public ItemDto(UUID id, String description, LocalDateTime createdAt, STATUS status) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.status = status;
    }

    public static ItemDto of(UUID id, String description, LocalDateTime createdAt, STATUS status) {
        return new ItemDto(id, description, createdAt, status);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }
}
