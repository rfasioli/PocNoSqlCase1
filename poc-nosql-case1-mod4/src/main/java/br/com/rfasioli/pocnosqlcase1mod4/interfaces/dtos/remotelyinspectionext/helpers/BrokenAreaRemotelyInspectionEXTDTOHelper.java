package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.helpers;

import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.BrokenAreaRemotelyInspectionEXTDTO;

public class BrokenAreaRemotelyInspectionEXTDTOHelper {

    public static final BrokenAreaRemotelyInspectionEXTDTO build(){
        BrokenAreaRemotelyInspectionEXTDTO brokenAreaRemotelyInspectionEXTDTO = new BrokenAreaRemotelyInspectionEXTDTO();

        brokenAreaRemotelyInspectionEXTDTO.setHectares(100.0);
        brokenAreaRemotelyInspectionEXTDTO.setMinBrokenArea(0.0);
        brokenAreaRemotelyInspectionEXTDTO.setMaxBrokenArea(100.0);
        brokenAreaRemotelyInspectionEXTDTO.setPercentage(100.0);
        brokenAreaRemotelyInspectionEXTDTO.setImageId("imageId");
        brokenAreaRemotelyInspectionEXTDTO.setHasAlert(false);

        return  brokenAreaRemotelyInspectionEXTDTO;
    }
}
