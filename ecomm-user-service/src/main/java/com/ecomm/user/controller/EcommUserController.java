package com.ecomm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.user.entity.EcommPaymentEntity;
import com.ecomm.user.entity.EcommUserEntity;
import com.ecomm.user.model.EcommUserPaymentDto;
import com.ecomm.user.model.EcommUserProductDto;
import com.ecomm.user.service.EcommUserProductService;

@RestController
@RequestMapping("/user/")
public class EcommUserController {
	
	@Autowired
	private EcommUserProductService ecommSellerProductService;
	
	
	@PostMapping("/product/search")
	public List<EcommUserEntity> serachProduct(@RequestBody EcommUserProductDto ecommSellerProductDto) {
		return ecommSellerProductService.searchProduct(ecommSellerProductDto);
	}
	
	@PostMapping("/product/payment")
	public EcommPaymentEntity userPayment(@RequestBody EcommUserPaymentDto ecommUserPaymentDto) {
		return ecommSellerProductService.userPayment(ecommUserPaymentDto);
	}
}