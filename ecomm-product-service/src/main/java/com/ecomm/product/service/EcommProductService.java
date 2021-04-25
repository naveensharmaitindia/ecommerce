package com.ecomm.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.CriteriaQuery;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.product.entity.EcommProductEntity;
import com.ecomm.product.model.EcommProductDto;
import com.ecomm.product.repository.EcommProductRepository;

@Service
public class EcommProductService {

	private EcommProductRepository ecommProductRepository;

	public EcommProductService(EcommProductRepository ecommProductRepository) {
		this.ecommProductRepository=ecommProductRepository;
	}

	@Transactional(rollbackFor = Throwable.class, propagation = Propagation.REQUIRED)
	public EcommProductEntity addProduct(EcommProductDto ecommPaymentDto ) {
		EcommProductEntity ecommProductEntity = new EcommProductEntity.EcommProductBuilder()
				.withEcommProductAvailable("Y")
				.withEcommProductCompany(ecommPaymentDto.getProductCompany())
				.withEcommProductId((new Random()).nextLong())
				.withEcommProductName(ecommPaymentDto.getProductName())
				.withEcommProductOffer(ecommPaymentDto.getProductOffer())
				.withEcommProductPrice(ecommPaymentDto.getProductPrice())
				.withEcommProductSeller(ecommPaymentDto.getProductSeller())
				.withEocmmProductDescription(ecommPaymentDto.getProductSeller())
				.withEcommProductQuantity(ecommPaymentDto.getProductQuantity())
				.build();

		return ecommProductRepository.save(ecommProductEntity);
	}

	@SuppressWarnings("serial")
	@Transactional(readOnly = true)
	public List<EcommProductEntity> searchProduct(Pageable pageable, EcommProductDto ecommProductDto) {
		@SuppressWarnings("unchecked")
		Page<EcommProductEntity> page = ecommProductRepository.findAll(new Specification<EcommProductEntity>() {
			
			@Override
			public Predicate toPredicate(Root<EcommProductEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				
				List<Predicate> predicates = new ArrayList<>();
				if(StringUtils.isNotEmpty(ecommProductDto.getProductName())) {
					predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("ecommProductName"), ecommProductDto.getProductName())));
				}  
				
				if(StringUtils.isNotEmpty(ecommProductDto.getProductCompany())) {
					predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("ecommProductCompany"), ecommProductDto.getProductCompany())));
				} 
				
				if(StringUtils.isNotEmpty(ecommProductDto.getProductCompany())) {
					predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("ecommProductAvailable"), ecommProductDto.getProductAvailable())));
				} 
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			}
			
		}, pageable);
		page.getTotalElements();        
		page.getTotalPages();           
		return page.getContent();       
	}
}