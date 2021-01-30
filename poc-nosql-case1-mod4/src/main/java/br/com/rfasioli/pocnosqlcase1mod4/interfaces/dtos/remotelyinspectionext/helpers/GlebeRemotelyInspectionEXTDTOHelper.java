package br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.helpers;

import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.FieldRemotelyInspectionEXTDTO;
import br.com.rfasioli.pocnosqlcase1mod4.interfaces.dtos.remotelyinspectionext.GlebeRemotelyInspectionEXTDTO;

import java.util.ArrayList;
import java.util.List;

public class GlebeRemotelyInspectionEXTDTOHelper {

	public static final GlebeRemotelyInspectionEXTDTO build() {
		final Double area = 0.0;
		final Double areaPercentage = 0.0;
		return GlebeRemotelyInspectionEXTDTO
				.create("465c0b6c-8817-4b79-9e9a-082fdabd1a79", area, area, areaPercentage,
						"description", buildListGlebes());
    }

	private static List<FieldRemotelyInspectionEXTDTO> buildListGlebes() {
		final List<FieldRemotelyInspectionEXTDTO> listFieldsEXT = new ArrayList<>();

		listFieldsEXT.add(FieldRemotelyInspectionEXTDTOHelper.build());

        return listFieldsEXT;
    }
}
