package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.helpers;

import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.CultureRemotelyInspectionEXTDTO;
import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.CultureStatusEnum;

public class CultureRemotelyInspectionEXTDTOHelper {

    public static final CultureRemotelyInspectionEXTDTO build(){
        CultureRemotelyInspectionEXTDTO cultureRemotelyInspectionEXTDTO = new CultureRemotelyInspectionEXTDTO();

        cultureRemotelyInspectionEXTDTO.setValidationInformedCulture(CultureStatusEnum.PROCEDENT);
        cultureRemotelyInspectionEXTDTO.setCode(2);
        cultureRemotelyInspectionEXTDTO.setName("Soja");

        return cultureRemotelyInspectionEXTDTO;
    }
}
