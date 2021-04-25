package com.ecomm.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.user.client.UserPaymentClient;
import com.ecomm.user.client.UserProductClient;
import com.ecomm.user.entity.EcommPaymentEntity;
import com.ecomm.user.entity.EcommUserEntity;
import com.ecomm.user.model.EcommUserPaymentDto;
import com.ecomm.user.model.EcommUserProductDto;

@Service
public class EcommUserProductService {
	
	private UserProductClient userProductClient;
	private UserPaymentClient userPaymentClient;

	public EcommUserProductService(UserProductClient userProductClient,UserPaymentClient userPaymentClient) {
		this.userProductClient=userProductClient;
		this.userPaymentClient=userPaymentClient;
	}

	@Transactional(readOnly = true)
	public List<EcommUserEntity> searchProduct(EcommUserProductDto ecommPaymentDto ) {
		return userProductClient.searchProduct(ecommPaymentDto);
	}

	@Transactional(readOnly = true)
	public EcommPaymentEntity userPayment(EcommUserPaymentDto ecommUserPaymentDto) {
		return userPaymentClient.performPayment(ecommUserPaymentDto);
	}
}