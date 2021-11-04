package com.hitss.pis.rest.webservices.bo.pa03pcrREAD;

public class SIPA03PCRREADEntradaBO {
	
	    private String fabkrs;
	    private String errornoaccounting;

	    public SIPA03PCRREADEntradaBO() {
		}

		public SIPA03PCRREADEntradaBO(String fabkrs, String errornoaccounting) {
			this.fabkrs = fabkrs;
			this.errornoaccounting = errornoaccounting;
		}

		public String getFabkrs() {
			return fabkrs;
		}

		public void setFabkrs(String fabkrs) {
			this.fabkrs = fabkrs;
		}

		public String getErrornoaccounting() {
			return errornoaccounting;
		}

		public void setErrornoaccounting(String errornoaccounting) {
			this.errornoaccounting = errornoaccounting;
		}

		@Override
		public String toString() {
			return "SIPA03PCRREADEntradaBO [fabkrs=" + fabkrs + ", errornoaccounting=" + errornoaccounting + "]";
		}
	    
}
