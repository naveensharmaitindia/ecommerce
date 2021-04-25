package com.ecomm.seller.service;

import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.seller.client.SellerProductClient;
import com.ecomm.seller.entity.EcommProductEntity;
import com.ecomm.seller.model.EcommSellerProductDto;

@Service
public class EcommSellerProductService {
	
	private SellerProductClient sellerProductClient;

	public EcommSellerProductService(SellerProductClient sellerProductClient) {
		this.sellerProductClient=sellerProductClient;
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED)
	public EcommProductEntity addProduct(EcommSellerProductDto ecommPaymentDto ) {
		/*EcommProductEntity ecommProductEntity = new EcommProductEntity.EcommProductBuilder()
				.withEcommProductAvailable("Y")
				.withEcommProductCompany(ecommPaymentDto.getProductCompany())
				.withEcommProductId((new Random()).nextLong())
				.withEcommProductName(ecommPaymentDto.getProductName())
				.withEcommProductOffer(ecommPaymentDto.getProductOffer())
				.withEcommProductPrice(ecommPaymentDto.getProductPrice())
				.withEcommProductSeller(ecommPaymentDto.getProductSeller())
				.withEocmmProductDescription(ecommPaymentDto.getProductSeller())
				.build();*/
		return sellerProductClient.addProduct(ecommPaymentDto);
	}
}