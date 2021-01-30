package br.com.rfasioli.pocnosqlcase1mod2.business.domains;

import br.com.rfasioli.pocnosqlcase1mod2.enums.STATUS;

import java.time.LocalDateTime;
import java.util.UUID;

public class Item {
    private UUID id;
    private String description;
    private LocalDateTime createdAt;
    private STATUS status;

    public Item() {
    }

    private Item(Builder builder) {
        id = builder.id;
        description = builder.description;
        createdAt = builder.createdAt;
        status = builder.status;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Item copy) {
        Builder builder = new Builder();
        builder.id = copy.getId();
        builder.description = copy.getDescription();
        builder.createdAt = copy.getCreatedAt();
        builder.status = copy.getStatus();
        return builder;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public STATUS getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("id", id)
                .append("description", description)
                .append("createdAt", createdAt)
                .append("status", status)
                .toString();
    }

    public static final class Builder {
        private UUID id;
        private String description;
        private LocalDateTime createdAt;
        private STATUS status;

        private Builder() {
        }

        public Builder withId(UUID val) {
            id = val;
            return this;
        }

        public Builder withDescription(String val) {
            description = val;
            return this;
        }

        public Builder withCreatedAt(LocalDateTime val) {
            createdAt = val;
            return this;
        }

        public Builder withStatus(STATUS val) {
            status = val;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
