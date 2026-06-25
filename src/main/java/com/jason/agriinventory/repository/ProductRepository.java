package com.jason.agriinventory.repository;

import com.jason.agriinventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByProductNameContainingIgnoreCase(String productName);
    List<Product> findByQuantityLessThan(Integer quantity);
}