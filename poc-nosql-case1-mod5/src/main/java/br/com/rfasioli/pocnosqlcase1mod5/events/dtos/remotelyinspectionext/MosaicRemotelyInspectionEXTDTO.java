package br.com.rfasioli.pocnosqlcase1mod5.events.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

import static java.util.Objects.isNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MosaicRemotelyInspectionEXTDTO {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private Double value;
    private Double mean;
    private Double max;
    private String tifNDVI;
    private String tifRGB;
    private String pngNDVI;
    private String pngRGB;
    private Double percentageCloud;

    private static String removePrefix(String source, String prefix) {
        if (isNull(prefix) || prefix.isEmpty() || isNull(source) || source.isEmpty()) {
            return source;
        }
        return source.replaceFirst(String.format("^%s", prefix), "");
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(final Double value) {
        this.value = value;
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(final Double mean) {
        this.mean = mean;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(final Double max) {
        this.max = max;
    }

    public String getTifNDVI() {
        return tifNDVI;
    }

    public void setTifNDVI(String tifNDVI) {
        this.tifNDVI = tifNDVI;
    }

    public String getTifRGB() {
        return tifRGB;
    }

    public void setTifRGB(String tifRGB) {
        this.tifRGB = tifRGB;
    }

    public String getPngNDVI() {
        return pngNDVI;
    }

    public void setPngNDVI(final String pngNDVI) {
        this.pngNDVI = pngNDVI;
    }

    public String getPngRGB() {
        return pngRGB;
    }

    public void setPngRGB(final String pngRGB) {
        this.pngRGB = pngRGB;
    }

    public Double getPercentageCloud() {
        return percentageCloud;
    }

    public void setPercentageCloud(final Double percentageCloud) {
        this.percentageCloud = percentageCloud;
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
