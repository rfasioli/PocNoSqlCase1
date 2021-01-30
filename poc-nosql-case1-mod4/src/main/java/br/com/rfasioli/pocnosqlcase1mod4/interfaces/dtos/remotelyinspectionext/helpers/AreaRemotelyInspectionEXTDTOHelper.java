package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.helpers;

import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.AreaRemotelyInspectionEXTDTO;

public class AreaRemotelyInspectionEXTDTOHelper {

    public static final AreaRemotelyInspectionEXTDTO build() {
        final AreaRemotelyInspectionEXTDTO areaRemotelyInspectionEXTDTO = new AreaRemotelyInspectionEXTDTO();

        areaRemotelyInspectionEXTDTO.setInformedAreaInHectare(100.0);
        areaRemotelyInspectionEXTDTO.setEffectiveAreaInHectare(100.0);
        areaRemotelyInspectionEXTDTO.setPercentage(100.0);

        return areaRemotelyInspectionEXTDTO;
    }
}