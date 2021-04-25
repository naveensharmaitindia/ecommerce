package com.ecomm.seller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecomm.seller.entity.EcommProductEntity;
import com.ecomm.seller.model.EcommSellerProductDto;

@FeignClient(name="ecomm-product-service")
public interface SellerProductClient {
	
	@PostMapping("/product/add")
	public EcommProductEntity addProduct(EcommSellerProductDto ecommSellerProductDto);
}
