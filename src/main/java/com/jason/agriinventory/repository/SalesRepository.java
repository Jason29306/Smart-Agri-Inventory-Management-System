package com.jason.agriinventory.repository;

import com.jason.agriinventory.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository
        extends JpaRepository<Sales, Integer> {
}