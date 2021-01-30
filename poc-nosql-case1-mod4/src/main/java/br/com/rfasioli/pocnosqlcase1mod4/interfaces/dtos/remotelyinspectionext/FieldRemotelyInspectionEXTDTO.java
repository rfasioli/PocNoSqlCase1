package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
//import com.vividsolutions.jts.geom.Geometry;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldRemotelyInspectionEXTDTO {

	private String id;

//	private Geometry geom;

	private AreaRemotelyInspectionEXTDTO area;

	private String mosaicReferenceURL;

	private String mosaicReferenceNDVIURL;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date mosaicReferenceDate;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonProperty(value = "emergence_at")
	private Date emergenceAt;

	private HarvestRemotelyInspectionEXTDTO harvest;

	private CultureRemotelyInspectionEXTDTO culture;

	@JsonProperty(value = "current_vegetative_phase")
	private String currentVegetativePhase;

	@JsonProperty(value = "estimated_productivity")
	private String estimatedProductivity;

	@JsonProperty(value = "has_biomass_alert")
	private Boolean hasBiomassAlert;

	@JsonProperty(value = "biomass_graphic")
	private String temporalAnalysis;

	@JsonProperty(value = "broken_area")
	private BrokenAreaRemotelyInspectionEXTDTO brokenArea;

	private String imagesNDVIBaseURL;

	private List<MosaicRemotelyInspectionEXTDTO> ndvis;

	public static FieldRemotelyInspectionEXTDTO create(String id,
//													   Geometry geom,
													   AreaRemotelyInspectionEXTDTO area,
													   String mosaicReferenceURL,
													   String mosaicReferenceNDVIImageURL,
													   Date emergenceAt,
													   Date mosaicReferenceDate,
													   CultureRemotelyInspectionEXTDTO culture,
													   String currentVegetativePhase,
													   String estimatedProductivity,
													   boolean hasBiomassAlert,
													   String temporalAnalysisURL,
													   BrokenAreaRemotelyInspectionEXTDTO brokenArea,
													   List<MosaicRemotelyInspectionEXTDTO> ndvis,
													   String imagesNDVIBaseURL) {

		FieldRemotelyInspectionEXTDTO fieldRemotelyInspectionEXTDTO = new FieldRemotelyInspectionEXTDTO();

		fieldRemotelyInspectionEXTDTO.setId(id);
//		fieldRemotelyInspectionEXTDTO.setGeom(geom);
		fieldRemotelyInspectionEXTDTO.setArea(area);
		fieldRemotelyInspectionEXTDTO.setMosaicReferenceURL(mosaicReferenceURL);
		fieldRemotelyInspectionEXTDTO.setMosaicReferenceNDVIURL(mosaicReferenceNDVIImageURL);
		fieldRemotelyInspectionEXTDTO.setMosaicReferenceDate(mosaicReferenceDate);
		fieldRemotelyInspectionEXTDTO.setEmergenceAt(emergenceAt);
		fieldRemotelyInspectionEXTDTO.setCulture(culture);
		fieldRemotelyInspectionEXTDTO.setCurrentVegetativePhase(currentVegetativePhase);
		fieldRemotelyInspectionEXTDTO.setEstimatedProductivity(estimatedProductivity);
		fieldRemotelyInspectionEXTDTO.setHasBiomassAlert(hasBiomassAlert);
		fieldRemotelyInspectionEXTDTO.setTemporalAnalysis(temporalAnalysisURL);
		fieldRemotelyInspectionEXTDTO.setBrokenArea(brokenArea);
		fieldRemotelyInspectionEXTDTO.setNdvis(ndvis);
		fieldRemotelyInspectionEXTDTO.setImagesNDVIBaseURL(imagesNDVIBaseURL);

		return fieldRemotelyInspectionEXTDTO;
	}

	private FieldRemotelyInspectionEXTDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public Geometry getGeom() {
//		return geom;
//	}
//
//	public void setGeom(Geometry geom) {
//		this.geom = geom;
//	}

	public AreaRemotelyInspectionEXTDTO getArea() {
		return area;
	}

	public void setArea(AreaRemotelyInspectionEXTDTO area) {
		this.area = area;
	}

	public Date getEmergenceAt() {
		return emergenceAt;
	}

	public void setEmergenceAt(Date emergenceAt) {
		this.emergenceAt = emergenceAt;
	}

	public CultureRemotelyInspectionEXTDTO getCulture() {
		return culture;
	}

	public void setCulture(CultureRemotelyInspectionEXTDTO culture) {
		this.culture = culture;
	}

	public String getCurrentVegetativePhase() {
		return currentVegetativePhase;
	}

	public void setCurrentVegetativePhase(String currentVegetativePhase) {
		this.currentVegetativePhase = currentVegetativePhase;
	}

	public String getEstimatedProductivity() {
		return estimatedProductivity;
	}

	public void setEstimatedProductivity(String estimatedProductivity) {
		this.estimatedProductivity = estimatedProductivity;
	}

	public Boolean hasBiomassAlert() {
		return hasBiomassAlert;
	}

	public void setHasBiomassAlert(Boolean hasBiomassAlert) {
		this.hasBiomassAlert = hasBiomassAlert;
	}

	public String getTemporalAnalysis() {
		return temporalAnalysis;
	}

	public void setTemporalAnalysis(String temporalAnalysis) {
		this.temporalAnalysis = temporalAnalysis;
	}

	public BrokenAreaRemotelyInspectionEXTDTO getBrokenArea() {
		return brokenArea;
	}

	public void setBrokenArea(BrokenAreaRemotelyInspectionEXTDTO brokenArea) {
		this.brokenArea = brokenArea;
	}

	public List<MosaicRemotelyInspectionEXTDTO> getNdvis() {
		return ndvis;
	}

	public void setNdvis(List<MosaicRemotelyInspectionEXTDTO> ndvis) {
		this.ndvis = ndvis;
	}

	public String getImagesNDVIBaseURL() {
		return imagesNDVIBaseURL;
	}

	public void setImagesNDVIBaseURL(String imagesNDVIBaseURL) {
		this.imagesNDVIBaseURL = imagesNDVIBaseURL;
	}

	public HarvestRemotelyInspectionEXTDTO getHarvest() {
		return harvest;
	}

	public void setHarvest(HarvestRemotelyInspectionEXTDTO harvest) {
		this.harvest = harvest;
	}

	public String getMosaicReferenceURL() {
		return mosaicReferenceURL;
	}

	public void setMosaicReferenceURL(String mosaicReferenceURL) {
		this.mosaicReferenceURL = mosaicReferenceURL;
	}

	public String getMosaicReferenceNDVIURL() {
		return mosaicReferenceNDVIURL;
	}

	public void setMosaicReferenceNDVIURL(String mosaicReferenceNDVIURL) {
		this.mosaicReferenceNDVIURL = mosaicReferenceNDVIURL;
	}

	public Date getMosaicReferenceDate() {
		return mosaicReferenceDate;
	}

	public void setMosaicReferenceDate(Date mosaicReferenceDate) {
		this.mosaicReferenceDate = mosaicReferenceDate;
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
