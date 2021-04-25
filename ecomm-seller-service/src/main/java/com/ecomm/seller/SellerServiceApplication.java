package com.ecomm.seller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SellerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerServiceApplication.class, args);
	}
}
