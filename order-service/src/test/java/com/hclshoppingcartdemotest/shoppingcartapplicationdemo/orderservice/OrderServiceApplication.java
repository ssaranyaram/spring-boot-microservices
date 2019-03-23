package com.hclshoppingcartdemotest.shoppingcartapplicationdemo.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.hclshoppingcartdemo.orderservice.OrderServiceApplication.class, args);
	}
}
