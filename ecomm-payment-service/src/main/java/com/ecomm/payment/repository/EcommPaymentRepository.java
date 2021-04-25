package com.ecomm.payment.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecomm.payment.entity.EcommPaymentEntity;

@Repository
public interface EcommPaymentRepository extends JpaRepository<EcommPaymentEntity, Long>, JpaSpecificationExecutor {
	 Page<EcommPaymentEntity> findByEcommPaymentCreatedByOrderByEcommPaymentCreatedTs(Pageable pageable,String ecommPaymentCreated);
}
