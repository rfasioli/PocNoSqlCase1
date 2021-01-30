package br.com.rfasioli.pocnosqlcase1mod5.events.dtos.remotelyinspectionext;

public enum BrokenAreaStatusEnum {

	RED_ALERT, YELLOW_ALERT, NAO_QUEBRA, INCONCLUSIVE;
	
	public boolean hasAlert() {
		return this == RED_ALERT || this == YELLOW_ALERT;
	}
}
