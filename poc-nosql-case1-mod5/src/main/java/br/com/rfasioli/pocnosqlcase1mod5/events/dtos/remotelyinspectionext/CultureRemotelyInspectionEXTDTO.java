package br.com.rfasioli.pocnosqlcase1mod5.events.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CultureRemotelyInspectionEXTDTO {

    private String name;
    private Integer code;
    private CultureStatusEnum validationInformedCulture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CultureStatusEnum getValidationInformedCulture() {
        return validationInformedCulture;
    }

    public void setValidationInformedCulture(CultureStatusEnum validationInformedCulture) {
        this.validationInformedCulture = validationInformedCulture;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(final Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
