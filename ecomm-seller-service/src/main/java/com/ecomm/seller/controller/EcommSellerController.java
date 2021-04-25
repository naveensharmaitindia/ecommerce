package com.ecomm.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.seller.entity.EcommProductEntity;
import com.ecomm.seller.model.EcommSellerProductDto;
import com.ecomm.seller.service.EcommSellerProductService;

@RestController
@RequestMapping("/seller/")
public class EcommSellerController {
	
	@Autowired
	private EcommSellerProductService ecommSellerProductService;
	
	
	@PostMapping("/product/add")
	public EcommProductEntity addSellerProduct(@RequestBody EcommSellerProductDto ecommSellerProductDto) {
		return ecommSellerProductService.addProduct(ecommSellerProductDto);
	}
}