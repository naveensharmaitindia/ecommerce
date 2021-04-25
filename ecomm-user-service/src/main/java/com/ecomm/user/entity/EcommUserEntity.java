package com.ecomm.user.entity;

import java.util.Date;


public class EcommUserEntity {

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

	public EcommUserEntity() {
	}

	public EcommUserEntity(Long ecommProductId, String ecommProductName, String eocmmProductDescription,
			Double ecommProductPrice, String ecommProductCompany, String ecommProductSeller, String ecommProductOffer,
			String ecommProductAvailable, String ecommProductCreatedBy, Date ecommProductCreatedTs) {

		this.ecommProductId = ecommProductId;
		this.ecommProductName = ecommProductName;
		this.eocmmProductDescription = eocmmProductDescription;
		this.ecommProductPrice = ecommProductPrice;
		this.ecommProductCompany = ecommProductCompany;
		this.ecommProductSeller = ecommProductSeller;
		this.ecommProductOffer = ecommProductOffer;
		this.ecommProductAvailable = ecommProductAvailable;
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
		
		public EcommProductBuilder withEcommProductCreatedBy(String ecommProductCreatedBy) {
			this.ecommProductCreatedBy = ecommProductCreatedBy;
			return this;
		}
		
		public EcommProductBuilder withEcommProductCreatedTs(Date ecommProductCreatedTs) {
			this.ecommProductCreatedTs = ecommProductCreatedTs;
			return this;
		}
		
		public EcommUserEntity build() { 
			return new EcommUserEntity(ecommProductId,ecommProductName,
					ecocmmProductDescription,ecommProductPrice,
					ecommProductCompany,ecommProductSeller,
					ecommProductOffer,ecommProductAvailable,"naveen",new Date()); 
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
}