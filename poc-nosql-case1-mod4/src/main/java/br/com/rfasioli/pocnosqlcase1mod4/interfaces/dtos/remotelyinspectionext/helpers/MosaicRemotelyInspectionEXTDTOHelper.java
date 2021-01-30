package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.helpers;

import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.MosaicRemotelyInspectionEXTDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MosaicRemotelyInspectionEXTDTOHelper {

    public static final MosaicRemotelyInspectionEXTDTO build(){
        MosaicRemotelyInspectionEXTDTO mosaicRemotelyInspectionEXTDTO = new MosaicRemotelyInspectionEXTDTO();

        mosaicRemotelyInspectionEXTDTO.setDate(new Date());
        mosaicRemotelyInspectionEXTDTO.setValue(0.0);
        mosaicRemotelyInspectionEXTDTO.setMean(0.0);
        mosaicRemotelyInspectionEXTDTO.setMax(0.0);

        return mosaicRemotelyInspectionEXTDTO;
    }

    public static List<MosaicRemotelyInspectionEXTDTO> buildList(){
        List<MosaicRemotelyInspectionEXTDTO> ndvis = new ArrayList<>();

        ndvis.add(build());
        ndvis.add(build());
        ndvis.add(build());

        return ndvis;
    }
}
