package com.ecomm.product.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ECOMM_PRODUCT")
@Entity
public class EcommProductEntity {

	@Id
	@Column(name = "ECOMM_PRODUCT_ID")
	private Long ecommProductId;

	@Column(name = "ECOMM_PRODUCT_NAME")
	private String ecommProductName;

	@Column(name = "ECOMM_PRODUCT_DESCRIPTION")
	private String eocmmProductDescription;

	@Column(name = "ECOMM_PRODUCT_PRICE")
	private Double ecommProductPrice;

	@Column(name = "ECOMM_PRODUCT_COMPANY")
	private String ecommProductCompany;

	@Column(name = "ECOMM_PRODUCT_SELLER")
	private String ecommProductSeller;

	@Column(name = "ECOMM_PRODUCT_OFFER")
	private String ecommProductOffer;

	@Column(name = "ECOMM_PRODUCT_AVILABLE")
	private String ecommProductAvailable;

	@Column(name = "ECOMM_PRODUCT_QUANTITY")
	private Long ecommProductQuantity;
	
	@Column(name = "ECOMM_PRODUCT_CREATED_BY")
	private String ecommProductCreatedBy;

	@Column(name = "ECOMM_PRODUCT_CREATED_TS")
	private Date ecommProductCreatedTs;

	public EcommProductEntity() {
	}

	public EcommProductEntity(Long ecommProductId, String ecommProductName, String eocmmProductDescription,
			Double ecommProductPrice, String ecommProductCompany, String ecommProductSeller, String ecommProductOffer,
			String ecommProductAvailable,Long ecommProductQuantity, String ecommProductCreatedBy, Date ecommProductCreatedTs) {

		this.ecommProductId = ecommProductId;
		this.ecommProductName = ecommProductName;
		this.eocmmProductDescription = eocmmProductDescription;
		this.ecommProductPrice = ecommProductPrice;
		this.ecommProductCompany = ecommProductCompany;
		this.ecommProductSeller = ecommProductSeller;
		this.ecommProductOffer = ecommProductOffer;
		this.ecommProductAvailable = ecommProductAvailable;
		this.ecommProductQuantity=ecommProductQuantity;
		this.ecommProductCreatedBy = ecommProductCreatedBy;
		this.ecommProductCreatedTs = ecommProductCreatedTs;
	}

	public static class EcommProductBuilder {

		private Long ecommProductId;
		private String ecommProductName;
		private String ecocmmProductDescription;
		private Double ecommProductPrice;
		private String ecommProductCompany;
		private String ecommProductSeller;
		private String ecommProductOffer;
		private String ecommProductAvailable;
		private Long ecommProductQuantity;
		private String ecommProductCreatedBy;
		
		public Long getEcommProductId() {
			return ecommProductId;
		}

		public String getEcommProductName() {
			return ecommProductName;
		}

		public String getEcocmmProductDescription() {
			return ecocmmProductDescription;
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

		public void setEcommProductId(Long ecommProductId) {
			this.ecommProductId = ecommProductId;
		}

		public void setEcommProductName(String ecommProductName) {
			this.ecommProductName = ecommProductName;
		}

		public void setEcocmmProductDescription(String ecocmmProductDescription) {
			this.ecocmmProductDescription = ecocmmProductDescription;
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

		private Date ecommProductCreatedTs;

		public EcommProductBuilder withEcommProductId(Long ecommProductId) {
			this.ecommProductId = ecommProductId;
			return this;
		}

		public EcommProductBuilder withEcommProductName(String ecommProductName) {
			this.ecommProductName = ecommProductName;
			return this;
		}
		
		public EcommProductBuilder withEocmmProductDescription(String ecocmmProductDescription) {
			this.ecocmmProductDescription = ecocmmProductDescription;
			return this;
		}
		
		public EcommProductBuilder withEcommProductPrice(Double ecommProductPrice) {
			this.ecommProductPrice = ecommProductPrice;
			return this;
		}
		
		public EcommProductBuilder withEcommProductCompany(String ecommProductCompany) {
			this.ecommProductCompany = ecommProductCompany;
			return this;
		}
		
		public EcommProductBuilder withEcommProductSeller(String ecommProductSeller) {
			this.ecommProductSeller = ecommProductSeller;
			return this;
		}
		
		public EcommProductBuilder withEcommProductOffer(String ecommProductOffer) {
			this.ecommProductOffer = ecommProductOffer;
			return this;
		}
		
		public EcommProductBuilder withEcommProductAvailable(String ecommProductAvailable) {
			this.ecommProductAvailable = ecommProductAvailable;
			return this;
		}
		
		public EcommProductBuilder withEcommProductQuantity(Long ecommProductQuantity) {
			this.ecommProductQuantity = ecommProductQuantity;
			return this;
		}
		
		
		public EcommProductBuilder withEcommProductCreatedBy(String ecommProductCreatedBy) {
			this.ecommProductCreatedBy = ecommProductCreatedBy;
			return this;
		}
		
		public EcommProductBuilder withEcommProductCreatedTs(Date ecommProductCreatedTs) {
			this.ecommProductCreatedTs = ecommProductCreatedTs;
			return this;
		}
		
		public EcommProductEntity build() { 
			return new EcommProductEntity(ecommProductId,ecommProductName,
					ecocmmProductDescription,ecommProductPrice,
					ecommProductCompany,ecommProductSeller,
					ecommProductOffer,ecommProductAvailable,ecommProductQuantity,"naveen",new Date()); 
		}

		public Long getEcommProductQuantity() {
			return ecommProductQuantity;
		}

		public void setEcommProductQuantity(Long ecommProductQuantity) {
			this.ecommProductQuantity = ecommProductQuantity;
		}
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

	public Long getEcommProductQuantity() {
		return ecommProductQuantity;
	}

	public void setEcommProductQuantity(Long ecommProductQuantity) {
		this.ecommProductQuantity = ecommProductQuantity;
	}
}