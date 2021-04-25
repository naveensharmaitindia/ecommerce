package com.ecomm.user.entity;

import java.util.Date;

public class EcommPaymentEntity {
	
	private Long ecommPaymentId;
	private Double ecommPaymentAmount;
	private String ecommPaymentCardDetail;
	private String ecommPaymentTxnStatus;
	private String ecommPaymentCreatedBy;
	private Date ecommPaymentCreatedTs;
	
	public Long getEcommPaymentId() {
		return ecommPaymentId;
	}

	public Double getEcommPaymentAmount() {
		return ecommPaymentAmount;
	}

	public String getEcommPaymentCardDetail() {
		return ecommPaymentCardDetail;
	}

	public String getEcommPaymentTxnStatus() {
		return ecommPaymentTxnStatus;
	}

	public String getEcommPaymentCreatedBy() {
		return ecommPaymentCreatedBy;
	}

	public Date getEcommPaymentCreatedTs() {
		return ecommPaymentCreatedTs;
	}

	public void setEcommPaymentId(Long ecommPaymentId) {
		this.ecommPaymentId = ecommPaymentId;
	}

	public void setEcommPaymentAmount(Double ecommPaymentAmount) {
		this.ecommPaymentAmount = ecommPaymentAmount;
	}

	public void setEcommPaymentCardDetail(String ecommPaymentCardDetail) {
		this.ecommPaymentCardDetail = ecommPaymentCardDetail;
	}

	public void setEcommPaymentTxnStatus(String ecommPaymentTxnStatus) {
		this.ecommPaymentTxnStatus = ecommPaymentTxnStatus;
	}

	public void setEcommPaymentCreatedBy(String ecommPaymentCreatedBy) {
		this.ecommPaymentCreatedBy = ecommPaymentCreatedBy;
	}

	public void setEcommPaymentCreatedTs(Date ecommPaymentCreatedTs) {
		this.ecommPaymentCreatedTs = ecommPaymentCreatedTs;
	}
}