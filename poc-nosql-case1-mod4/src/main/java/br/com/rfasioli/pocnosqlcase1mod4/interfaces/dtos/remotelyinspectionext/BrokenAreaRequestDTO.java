package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrokenAreaRequestDTO {

	@JsonProperty("planting_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date plantingDate;

	@JsonProperty("images_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private List<Date> imagesDate = new ArrayList<>();

	@JsonProperty("ndvis_value")
	private List<Double> ndvisValue = new ArrayList<>();

	@JsonProperty("cloud_per_date")
	private List<Double> cloudPerDate = new ArrayList<>();

	@JsonProperty("url_mosaics")
	private List<String> urlMosaics = new ArrayList<>();

	@JsonProperty("url_ndvis")
	private List<String> urlNdvis = new ArrayList<>();

	@JsonProperty("reference_curve_bxp_url")
	private String referenceCurveBxpUrl;

	@JsonProperty("reference_curve_int_url")
	private String referenceCurveIntUrl;

	@JsonProperty("product_type")
	private String productType;

	@JsonProperty("senescence_period")
	private Integer senescencePeriod;

	@JsonProperty("initial_vegetative_period")
	private Integer initalVegetativePeriod;

//	@JsonSerialize(using = GeometrySerializer.class)
//	@JsonDeserialize(contentUsing = GeometryDeserializer.class)
//	private Geometry geometry;

	public Date getPlantingDate() {
		return plantingDate;
	}

	public void setPlantingDate(Date plantingDate) {
		this.plantingDate = plantingDate;
	}

	public List<Date> getImagesDate() {
		return imagesDate;
	}

	public void setImagesDate(List<Date> imagesDate) {
		this.imagesDate = imagesDate;
	}

	public List<Double> getNdvisValue() {
		return ndvisValue;
	}

	public void setNdvisValue(List<Double> ndvisValue) {
		this.ndvisValue = ndvisValue;
	}

	public List<Double> getCloudPerDate() {
		return cloudPerDate;
	}

	public void setCloudPerDate(List<Double> cloudPerDate) {
		this.cloudPerDate = cloudPerDate;
	}

	public List<String> getUrlMosaics() {
		return urlMosaics;
	}

	public void setUrlMosaics(List<String> urlMosaics) {
		this.urlMosaics = urlMosaics;
	}

	public List<String> getUrlNdvis() {
		return urlNdvis;
	}

	public void setUrlNdvis(List<String> urlNdvis) {
		this.urlNdvis = urlNdvis;
	}

	public String getReferenceCurveBxpUrl() {
		return referenceCurveBxpUrl;
	}

	public void setReferenceCurveBxpUrl(String referenceCurveBxpUrl) {
		this.referenceCurveBxpUrl = referenceCurveBxpUrl;
	}

	public String getReferenceCurveIntUrl() {
		return referenceCurveIntUrl;
	}

	public void setReferenceCurveIntUrl(String referenceCurveIntUrl) {
		this.referenceCurveIntUrl = referenceCurveIntUrl;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Integer getSenescencePeriod() {
		return senescencePeriod;
	}

	public void setSenescencePeriod(Integer senescencePeriod) {
		this.senescencePeriod = senescencePeriod;
	}

	public Integer getInitalVegetativePeriod() {
		return initalVegetativePeriod;
	}

	public void setInitalVegetativePeriod(Integer initalVegetativePeriod) {
		this.initalVegetativePeriod = initalVegetativePeriod;
	}

//	public Geometry getGeometry() {
//		return geometry;
//	}
//
//	public void setGeometry(Geometry geometry) {
//		this.geometry = geometry;
//	}

	public void addImagesDate(Date imageDate) {
		this.imagesDate.add(imageDate);
	}

	public void addNdvisValue(Double ndviValue) {
		this.ndvisValue.add(ndviValue);
	}

	public void addCloudPerDate(Double cloudPerDate) {
		this.cloudPerDate.add(cloudPerDate);
	}

	public void addUrlMosaics(String urlMosaic) {
		this.urlMosaics.add(urlMosaic);
	}

	public void addUrlNdvis(String urlNdvis) {
		this.urlNdvis.add(urlNdvis);
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
