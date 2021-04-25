package com.ecomm.payment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "ECOMM_PAYMENT")
@Entity
public class EcommPaymentEntity {
	
	@Id
	@Column(name="ECOMM_PAYMENT_ID")
	private Long ecommPaymentId;
	
	@Column(name="ECOMM_PAYMENT_AMOUNT")
	private Double ecommPaymentAmount;
	
	@Column(name="ECOMM_PAYMENT_CARD_DETAIL")
	private String ecommPaymentCardDetail;
	
	@Column(name="ECOMM_PAYMENT_TXN_STATUS")
	private String ecommPaymentTxnStatus;
	
	@Column(name="ECOMM_PAYMENT_TXN_CREATED_BY")
	private String ecommPaymentCreatedBy;
	
	@Column(name="ECOMM_PAYMENT_TXN_CREATED_TS")
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

	public EcommPaymentEntity() { }
	
	public EcommPaymentEntity(Long ecommPaymentId, Double ecommPaymentAmount, String ecommPaymentCardDetail,
			String ecommPaymentTxnStatus,String ecommPaymentCreatedBy,Date ecommPaymentCreatedTs) {
		
		super();
		this.ecommPaymentId = ecommPaymentId;
		this.ecommPaymentAmount = ecommPaymentAmount;
		this.ecommPaymentCardDetail = ecommPaymentCardDetail;
		this.ecommPaymentTxnStatus = ecommPaymentTxnStatus;
		this.ecommPaymentCreatedBy = ecommPaymentCreatedBy;
		this.ecommPaymentCreatedTs = ecommPaymentCreatedTs;
	}
	
	
	public static class EcommPaymentBuilder {
		
		private Long ecommPaymentId;
		private Double ecommPaymentAmount;
		private String ecommPaymentCardDetail;
		private String ecommPaymentTxnStatus;
		
		public EcommPaymentBuilder withEcommPaymentId(Long ecommPaymentId) {
			this.ecommPaymentId = ecommPaymentId;
			return this;
		}
		
		public EcommPaymentBuilder withEcommPaymentAmount(Double ecommPaymentAmount) {
			this.ecommPaymentAmount = ecommPaymentAmount;
			return this;
		}
		
		public EcommPaymentBuilder withEcommPaymentCardDetail(String ecommPaymentCardDetail) {
			this.ecommPaymentCardDetail = ecommPaymentCardDetail;
			return this;
		}
		
		public EcommPaymentBuilder withEcommPaymentTxnStatus(String ecommPaymentTxnStatus) {
			this.ecommPaymentTxnStatus = ecommPaymentTxnStatus;
			return this;
		}
		
		public EcommPaymentEntity build() {
			return new EcommPaymentEntity(ecommPaymentId,ecommPaymentAmount,ecommPaymentCardDetail,ecommPaymentTxnStatus,"naveen",new Date());
		}
	}
}