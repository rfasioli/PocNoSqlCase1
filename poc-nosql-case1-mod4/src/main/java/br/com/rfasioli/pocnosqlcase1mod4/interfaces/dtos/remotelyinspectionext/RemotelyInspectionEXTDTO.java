package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RemotelyInspectionEXTDTO implements Serializable {

    @JsonProperty(value = "inspection_id")
    private String inspectionId;

    private OperationType type;

    @JsonProperty(value = "service_order")
    private String serviceOrder;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonProperty(value = "inspected_at")
    private Date inspectedAt;

    private Set<GlebeRemotelyInspectionEXTDTO> glebes;

    public static RemotelyInspectionEXTDTO create(String inspectionId, OperationType type, Date inspectedAt, String serviceOrder){
        RemotelyInspectionEXTDTO remotelyInspectionEXTDTO = new RemotelyInspectionEXTDTO();

        remotelyInspectionEXTDTO.setInspectionId(inspectionId);
        remotelyInspectionEXTDTO.setType(type);
        remotelyInspectionEXTDTO.setInspectedAt(inspectedAt);
        remotelyInspectionEXTDTO.setServiceOrder(serviceOrder);

        return remotelyInspectionEXTDTO;
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(String inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Date getInspectedAt() {
        return inspectedAt;
    }

    public void setInspectedAt(Date inspectedAt) {
        this.inspectedAt = inspectedAt;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public String getServiceOrder() {
        return serviceOrder;
    }

    public void setServiceOrder(String serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public Set<GlebeRemotelyInspectionEXTDTO> getGlebes() {
        return glebes;
    }

    public void setGlebes(Set<GlebeRemotelyInspectionEXTDTO> glebes) {
        this.glebes = glebes;
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
