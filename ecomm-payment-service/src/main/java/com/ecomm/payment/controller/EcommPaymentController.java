package com.ecomm.payment.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.payment.entity.EcommPaymentEntity;
import com.ecomm.payment.model.EcommPaymentDto;
import com.ecomm.payment.service.EcommPaymentService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/payment/")
public class EcommPaymentController {
	
	private Logger logger = LoggerFactory.getLogger(EcommPaymentController.class);
	
	@Autowired
	private EcommPaymentService ecommPaymentService;
	
	
	@PostMapping("/perform")
	public EcommPaymentEntity performEcommPayment(@Valid @RequestBody EcommPaymentDto ecommPaymentDto) {
		logger.info("Payment request received.");
		return ecommPaymentService.perfromPayment(ecommPaymentDto);
	}
	
	@GetMapping("/history")
	@CircuitBreaker(name = "default", fallbackMethod = "fallBackResponse")
	public List<EcommPaymentEntity> ecommPaymentHistory(Pageable pageable) {
		logger.info("Payment history request received.");
		return ecommPaymentService.ecommPaymentTxnHistory(pageable);
	}
	
	public List<EcommPaymentEntity> fallBackResponse(Exception ex) {
		List<EcommPaymentEntity> list = new ArrayList<>();
		return list;
	}
}