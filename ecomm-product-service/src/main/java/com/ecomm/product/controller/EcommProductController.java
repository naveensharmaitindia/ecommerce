package com.ecomm.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.product.entity.EcommProductEntity;
import com.ecomm.product.model.EcommProductDto;
import com.ecomm.product.service.EcommProductService;

@RestController
@RequestMapping("/product/")
public class EcommProductController {
	
	@Autowired
	private EcommProductService ecommProductService;
	
	
	@PostMapping("/add")
	public EcommProductEntity performEcommPayment(@RequestBody EcommProductDto ecommProductDto) {
		return ecommProductService.addProduct(ecommProductDto);
	}
	
	@PostMapping("/search")
	public List<EcommProductEntity> searchProduct(Pageable pageable,@RequestBody EcommProductDto ecommProductDto) {
		return ecommProductService.searchProduct(pageable,ecommProductDto);
	}
}