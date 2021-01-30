package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.helpers;

import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.GlebeRemotelyInspectionEXTDTO;
import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.OperationType;
import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.RemotelyInspectionEXTDTO;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class RemotelyInspectionEXTDTOHelper {

    public static final RemotelyInspectionEXTDTO build(){
        RemotelyInspectionEXTDTO remotelyInspectionEXTDTO = new RemotelyInspectionEXTDTO();

        remotelyInspectionEXTDTO.setInspectionId(UUID.randomUUID().toString());
        remotelyInspectionEXTDTO.setType(OperationType.REMOTELY_INSPECTION);
        remotelyInspectionEXTDTO.setServiceOrder(UUID.randomUUID().toString());
        remotelyInspectionEXTDTO.setInspectedAt(new Date());

        Set<GlebeRemotelyInspectionEXTDTO> glebesEXT = new HashSet<>();

        glebesEXT.add(GlebeRemotelyInspectionEXTDTOHelper.build());
        glebesEXT.add(GlebeRemotelyInspectionEXTDTOHelper.build());

        remotelyInspectionEXTDTO.setGlebes(glebesEXT);

        return remotelyInspectionEXTDTO;
    }
}
