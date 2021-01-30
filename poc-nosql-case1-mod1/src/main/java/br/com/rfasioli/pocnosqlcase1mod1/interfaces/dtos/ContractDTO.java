package br.com.rfasioli.pocnosqlcase1mod1.interfaces.dtos;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.UUID;

public class ContractDTO {
    private UUID contentId;
    private String repliesTo;

    public UUID getContentId() {
        return contentId;
    }

    public void setContentId(UUID contentId) {
        this.contentId = contentId;
    }

    public String getRepliesTo() {
        return repliesTo;
    }

    public void setRepliesTo(String repliesTo) {
        this.repliesTo = repliesTo;
    }

    public ContractDTO() {
    }

    public ContractDTO(UUID contentId, String repliesTo) {
        this.contentId = contentId;
        this.repliesTo = repliesTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ContractDTO contractDTO = (ContractDTO) o;

        return new EqualsBuilder()
                .append(contentId, contractDTO.contentId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(contentId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("contentId", contentId)
                .append("repliesTo", repliesTo)
                .toString();
    }
}
