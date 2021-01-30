package br.com.rfasioli.pocnosqlcase1mod5.events.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HarvestRemotelyInspectionEXTDTO {

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty(value = "harvest_at")
	private Date harvestAt;
	@JsonProperty(value = "has_alert")
	private boolean hasAlert;

	public Date getHarvestAt() {
		return harvestAt;
	}

	public void setHarvestAt(Date harvestAt) {
		this.harvestAt = harvestAt;
	}

	public boolean isHasAlert() {
		return hasAlert;
	}

	public void setHasAlert(boolean hasAlert) {
		this.hasAlert = hasAlert;
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
