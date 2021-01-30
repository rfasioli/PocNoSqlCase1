package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrokenAreaResponseDTO {

	@JsonProperty(value = "result_png_url")
	private String urlBrokenAreaMap;
	@JsonProperty(value = "min_broken_area")
	private Double minBrokenArea;
	@JsonProperty(value = "min_percentage")
	private Double minPercentage;
	@JsonProperty(value = "max_broken_area")
	private Double maxBrokenArea;
	@JsonProperty(value = "max_percentage")
	private Double maxPercentage;
	@JsonProperty(value = "date_name")
	private Date date;
	@JsonProperty(value = "alert_status")
	private BrokenAreaStatusEnum alertStatus;

	public BrokenAreaResponseDTO() {}

	public String getUrlBrokenAreaMap() {
		return urlBrokenAreaMap;
	}

	public void setUrlBrokenAreaMap(String urlBrokenAreaMap) {
		this.urlBrokenAreaMap = urlBrokenAreaMap;
	}

	public Double getMinBrokenArea() {
		return minBrokenArea;
	}

	public void setMinBrokenArea(Double minBrokenArea) {
		this.minBrokenArea = minBrokenArea;
	}

	public Double getMinPercentage() {
		return minPercentage;
	}

	public void setMinPercentage(Double minPercentage) {
		this.minPercentage = minPercentage;
	}

	public Double getMaxBrokenArea() {
		return maxBrokenArea;
	}

	public void setMaxBrokenArea(Double maxBrokenArea) {
		this.maxBrokenArea = maxBrokenArea;
	}

	public Double getMaxPercentage() {
		return maxPercentage;
	}

	public void setMaxPercentage(Double maxPercentage) {
		this.maxPercentage = maxPercentage;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BrokenAreaStatusEnum getAlertStatus() {
		return alertStatus;
	}

	public void setAlertStatus(BrokenAreaStatusEnum alertStatus) {
		this.alertStatus = alertStatus;
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