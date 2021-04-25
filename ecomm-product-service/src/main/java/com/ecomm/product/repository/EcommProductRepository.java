package com.ecomm.product.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecomm.product.entity.EcommProductEntity;

@Repository
public interface EcommProductRepository extends JpaRepository<EcommProductEntity, Long>, JpaSpecificationExecutor {
	 //Page<EcommProductEntity> findByEcommPaymentCreatedByOrderByEcommPaymentCreatedTs(Pageable pageable,String ecommPaymentCreated);
}
