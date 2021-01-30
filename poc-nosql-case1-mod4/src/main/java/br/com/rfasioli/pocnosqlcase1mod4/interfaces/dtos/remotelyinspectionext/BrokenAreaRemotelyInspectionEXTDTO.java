package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrokenAreaRemotelyInspectionEXTDTO {

	private Double hectares;

	@JsonProperty(value = "has_alert")
	private Boolean hasAlert;
	@JsonProperty(value = "max_broken_area")
	private Double maxBrokenArea;
	@JsonProperty(value = "max_percentage")
	private Double maxPercentage;
	@JsonProperty(value = "min_broken_area")
	private Double minBrokenArea;
	@JsonProperty(value = "min_percentage")
	private Double minPercentage;
	private Double percentage;
	private String imageId;

	public Double getMinBrokenArea() {
		return minBrokenArea;
	}

	public void setMinBrokenArea(Double minBrokenArea) {
		this.minBrokenArea = minBrokenArea;
	}

	public Double getMaxBrokenArea() {
		return maxBrokenArea;
	}

	public void setMaxBrokenArea(Double maxBrokenArea) {
		this.maxBrokenArea = maxBrokenArea;
	}

	public Double getHectares() {
		return hectares;
	}

	public void setHectares(Double hectares) {
		this.hectares = hectares;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public Boolean getHasAlert() {
		return hasAlert;
	}

	public void setHasAlert(Boolean hasAlert) {
		this.hasAlert = hasAlert;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Double getMaxPercentage() {
		return maxPercentage;
	}

	public void setMaxPercentage(Double maxPercentage) {
		this.maxPercentage = maxPercentage;
	}

	public Double getMinPercentage() {
		return minPercentage;
	}

	public void setMinPercentage(Double minPercentage) {
		this.minPercentage = minPercentage;
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
