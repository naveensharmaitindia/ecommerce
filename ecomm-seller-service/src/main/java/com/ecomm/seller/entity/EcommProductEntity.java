package com.ecomm.seller.entity;

import java.util.Date;


public class EcommProductEntity {

	private Long ecommProductId;

	private String ecommProductName;

	private String eocmmProductDescription;

	private Double ecommProductPrice;

	private String ecommProductCompany;

	private String ecommProductSeller;

	private String ecommProductOffer;

	private String ecommProductAvailable;

	private String ecommProductCreatedBy;

	private Date ecommProductCreatedTs;
	
	private Long ecommProductQuantity;

	public EcommProductEntity() {
	}

	public Long getEcommProductId() {
		return ecommProductId;
	}

	public String getEcommProductName() {
		return ecommProductName;
	}

	public String getEocmmProductDescription() {
		return eocmmProductDescription;
	}

	public Double getEcommProductPrice() {
		return ecommProductPrice;
	}

	public String getEcommProductCompany() {
		return ecommProductCompany;
	}

	public String getEcommProductSeller() {
		return ecommProductSeller;
	}

	public String getEcommProductOffer() {
		return ecommProductOffer;
	}

	public String getEcommProductAvailable() {
		return ecommProductAvailable;
	}

	public String getEcommProductCreatedBy() {
		return ecommProductCreatedBy;
	}

	public Date getEcommProductCreatedTs() {
		return ecommProductCreatedTs;
	}

	public Long getEcommProductQuantity() {
		return ecommProductQuantity;
	}

	public void setEcommProductId(Long ecommProductId) {
		this.ecommProductId = ecommProductId;
	}

	public void setEcommProductName(String ecommProductName) {
		this.ecommProductName = ecommProductName;
	}

	public void setEocmmProductDescription(String eocmmProductDescription) {
		this.eocmmProductDescription = eocmmProductDescription;
	}

	public void setEcommProductPrice(Double ecommProductPrice) {
		this.ecommProductPrice = ecommProductPrice;
	}

	public void setEcommProductCompany(String ecommProductCompany) {
		this.ecommProductCompany = ecommProductCompany;
	}

	public void setEcommProductSeller(String ecommProductSeller) {
		this.ecommProductSeller = ecommProductSeller;
	}

	public void setEcommProductOffer(String ecommProductOffer) {
		this.ecommProductOffer = ecommProductOffer;
	}

	public void setEcommProductAvailable(String ecommProductAvailable) {
		this.ecommProductAvailable = ecommProductAvailable;
	}

	public void setEcommProductCreatedBy(String ecommProductCreatedBy) {
		this.ecommProductCreatedBy = ecommProductCreatedBy;
	}

	public void setEcommProductCreatedTs(Date ecommProductCreatedTs) {
		this.ecommProductCreatedTs = ecommProductCreatedTs;
	}

	public void setEcommProductQuantity(Long ecommProductQuantity) {
		this.ecommProductQuantity = ecommProductQuantity;
	}	
}