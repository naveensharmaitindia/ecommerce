package com.ecomm.user.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecomm.user.entity.EcommUserEntity;
import com.ecomm.user.model.EcommUserProductDto;

@FeignClient(name="ecomm-product-service")
public interface UserProductClient {
	
	@PostMapping("/product/search?size=1000")
	public List<EcommUserEntity> searchProduct(EcommUserProductDto ecommSellerProductDto);
}
