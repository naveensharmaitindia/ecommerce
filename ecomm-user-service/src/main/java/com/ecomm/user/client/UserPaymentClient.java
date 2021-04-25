package com.ecomm.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecomm.user.entity.EcommPaymentEntity;
import com.ecomm.user.model.EcommUserPaymentDto;

@FeignClient(name="ecomm-payment-service")
public interface UserPaymentClient {
	@PostMapping("/payment/perform?size=1000")
	public EcommPaymentEntity performPayment(EcommUserPaymentDto ecommUserPaymentDto);
}
