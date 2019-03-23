package com.hclshoppingcartdemotest.shoppingcartapplicationdemo.orderservice.repositories;

import com.hclshoppingcartdemo.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
