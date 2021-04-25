package com.ecomm.seller.model;

public class EcommSellerProductDto {
	
	private String productName;
	private String productDescription;
	private Double productPrice;
	private String productCompany;
	private String productSeller;
	private String productOffer;
	private String productAvailable;
	private Long productQuantity;
	
	public String getProductName() {
		return productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public String getProductSeller() {
		return productSeller;
	}
	public String getProductOffer() {
		return productOffer;
	}
	public String getProductAvailable() {
		return productAvailable;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	public void setProductSeller(String productSeller) {
		this.productSeller = productSeller;
	}
	public void setProductOffer(String productOffer) {
		this.productOffer = productOffer;
	}
	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}
	public Long getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Long productQuantity) {
		this.productQuantity = productQuantity;
	}
}