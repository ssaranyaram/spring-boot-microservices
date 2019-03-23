package com.hclshoppingcartdemotest.shoppingcartapplicationdemo.catalogservice.repositories;

import com.hclshoppingcartdemotest.shoppingcartapplicationdemo.catalogservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByCode(String code);
}
