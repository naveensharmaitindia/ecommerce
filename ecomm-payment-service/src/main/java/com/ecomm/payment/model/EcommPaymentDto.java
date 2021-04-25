package com.ecomm.payment.model;

import com.ecomm.payment.validation.CardValidation;

public class EcommPaymentDto {
	
	@CardValidation
	private String cardNumber;	
	private String cvv;
	private Double amount;
	
	public EcommPaymentDto(String cardNumber, String cvv, Double amount) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.amount = amount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public Double getAmount() {
		return amount;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}