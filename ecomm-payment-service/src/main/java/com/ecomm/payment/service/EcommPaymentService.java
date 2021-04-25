package com.ecomm.payment.service;

import java.util.List;
import java.util.Random;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.payment.constants.EcommPaymentConstants;
import com.ecomm.payment.entity.EcommPaymentEntity;
import com.ecomm.payment.model.EcommPaymentDto;
import com.ecomm.payment.repository.EcommPaymentRepository;

@Service
public class EcommPaymentService {
	
	private EcommPaymentRepository ecommPaymentRepository;
	
	public EcommPaymentService(EcommPaymentRepository ecommPaymentRepository) {
		this.ecommPaymentRepository=ecommPaymentRepository;
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED)
	public EcommPaymentEntity perfromPayment(EcommPaymentDto ecommPaymentDto ) {
		EcommPaymentEntity ecommPaymentEntity = new EcommPaymentEntity.EcommPaymentBuilder()
				.withEcommPaymentAmount(ecommPaymentDto.getAmount())
				.withEcommPaymentTxnStatus(EcommPaymentConstants.ECOMM_PAYMENT_TXN_STATUS_PROCESSING.getEcommPaymentTxnStatusValue())
				.withEcommPaymentId((new Random()).nextLong())
				.withEcommPaymentCardDetail(ecommPaymentDto.getCardNumber()).build();
		
		return ecommPaymentRepository.save(ecommPaymentEntity);
	}
	
	@Transactional(readOnly = true)
	public List<EcommPaymentEntity> ecommPaymentTxnHistory(Pageable pageable) {
		return ecommPaymentRepository.findByEcommPaymentCreatedByOrderByEcommPaymentCreatedTs(pageable,"naveen").getContent();
	}
}