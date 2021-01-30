package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlebeRemotelyInspectionEXTDTO {

    private String externalGlebeId;
    private Double effectiveAreaHa;
    private Double areaHa;
    private Double percentEffectiveArea;
//    private Geometry geom;
    private String description;
    private List<FieldRemotelyInspectionEXTDTO> fields;
    
    public static final GlebeRemotelyInspectionEXTDTO create(String externalGlebeId,
//                                                             Geometry geom,
                                                             Double effectiveAreaHa, Double areaHa,
                                                             Double percentEffectiveArea,
                                                             String description,
                                                             List<FieldRemotelyInspectionEXTDTO> fields) {
//        return new GlebeRemotelyInspectionEXTDTO(externalGlebeId, geom, effectiveAreaHa, areaHa, percentEffectiveArea, description, fields);
        return new GlebeRemotelyInspectionEXTDTO(externalGlebeId, effectiveAreaHa, areaHa, percentEffectiveArea, description, fields);
    }

//    public GlebeRemotelyInspectionEXTDTO() {
//    }

    private GlebeRemotelyInspectionEXTDTO(String externalGlebeId,
//                                          Geometry geom,
                                          Double effectiveAreaHa, Double areaHa, Double percentEffectiveArea,
                                          String description,
                                          List<FieldRemotelyInspectionEXTDTO> fields) {
        this.externalGlebeId = externalGlebeId;
        this.effectiveAreaHa = effectiveAreaHa;
        this.areaHa = areaHa;
        this.percentEffectiveArea = percentEffectiveArea;
//        this.geom = geom;
        this.description = description;
        this.fields = fields;
    }

    public String getExternalGlebeId() {
        return externalGlebeId;
    }

    public void setExternalGlebeId(String externalGlebeId) {
        this.externalGlebeId = externalGlebeId;
    }

//    public Geometry getGeom() {
//        return geom;
//    }
//
//    public void setGeom(Geometry geom) {
//        this.geom = geom;
//    }

    public List<FieldRemotelyInspectionEXTDTO> getFields() {
        return fields;
    }

    public void setFields(List<FieldRemotelyInspectionEXTDTO> fields) {
        this.fields = fields;
    }

    public Double getEffectiveAreaHa() {
        return effectiveAreaHa;
    }

    public void setEffectiveAreaHa(Double effectiveAreaHa) {
        this.effectiveAreaHa = effectiveAreaHa;
    }

    public Double getAreaHa() {
        return areaHa;
    }

    public void setAreaHa(Double areaHa) {
        this.areaHa = areaHa;
    }

    public Double getPercentEffectiveArea() {
        return percentEffectiveArea;
    }

    public void setPercentEffectiveArea(Double percentEffectiveArea) {
        this.percentEffectiveArea = percentEffectiveArea;
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
        return ReflectionToStringBuilder.toStringExclude(this, "geom");
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
