package com.ecomm.product.constants;

public enum EcommPaymentConstants {
	
	ECOMM_PAYMENT_TXN_STATUS_PROCESSING("PROCESSING");

	private String ecommPaymentTxnStatusValue;
	
	EcommPaymentConstants(String ecommPaymentTxnStatusValue) {
		this.ecommPaymentTxnStatusValue = ecommPaymentTxnStatusValue;
	}
	
	public String getEcommPaymentTxnStatusValue() {
		return ecommPaymentTxnStatusValue;
	}
}
