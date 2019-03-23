package com.hclshoppingcartdemo.inventoryservice.repositories;

import com.hclshoppingcartdemo.inventoryservice.entities.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {

    Optional<InventoryItem> findByProductCode(String productCode);
}
