package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.helpers;

import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.FieldRemotelyInspectionEXTDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class FieldRemotelyInspectionEXTDTOHelper {

	public static final FieldRemotelyInspectionEXTDTO build() {

		final FieldRemotelyInspectionEXTDTO fieldRemotelyInspectionEXTDTO = FieldRemotelyInspectionEXTDTO.create(
				UUID.randomUUID().toString(),
				AreaRemotelyInspectionEXTDTOHelper.build(),
				"mosaicReferenceURL",
				"rawReference",
				new Date(),
				new Date(),
				CultureRemotelyInspectionEXTDTOHelper.build(),
				"currentVegetativePhase",
				"estimatedProductivity",
				false,
				"url",
				BrokenAreaRemotelyInspectionEXTDTOHelper.build(),
				MosaicRemotelyInspectionEXTDTOHelper.buildList(),
				"");

		return fieldRemotelyInspectionEXTDTO;
	}

	public static List<FieldRemotelyInspectionEXTDTO> buildList() {
		final List<FieldRemotelyInspectionEXTDTO> listFields = new ArrayList<>();

		listFields.add(build());
		listFields.add(build());
		listFields.add(build());

		return listFields;
	}
}
