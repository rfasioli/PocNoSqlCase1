package br.com.rfasioli.pocnosqlcase1mod5.events.dtos.remotelyinspectionext;

public enum CultureStatusEnum {

	INCONCLUSIVE {
		@Override
		public String getDescription() {
			return "Inconclusivo";
		}
	},
	PROCEDENT {
		@Override
		public String getDescription() {
			return "Procedente";
		}
	},
	UNFOUNDED {
		@Override
		public String getDescription() {
			return "Improcedente";
		}
	},
	ONE_MORE_CULTURE {
		@Override
		public String getDescription() {
			return "Mais uma cultura";
		}
	},
	NOT_PLANTED {
		@Override
		public String getDescription() {
			return "Não plantou";
		}
	};

	public abstract String getDescription();
}
