package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class AreaRemotelyInspectionEXTDTO {

    @JsonProperty(value = "effective_area_in_hectare")
    private Double effectiveAreaInHectare;

    @JsonProperty(value = "informed_area_in_hectare")
    private Double informedAreaInHectare;

    private Double percentage;

    public Double getEffectiveAreaInHectare() {
        return effectiveAreaInHectare;
    }

    public void setEffectiveAreaInHectare(Double effectiveAreaInHectare) {
        this.effectiveAreaInHectare = effectiveAreaInHectare;
    }

    public Double getInformedAreaInHectare() {
        return informedAreaInHectare;
    }

    public void setInformedAreaInHectare(Double informedAreaInHectare) {
        this.informedAreaInHectare = informedAreaInHectare;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
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
