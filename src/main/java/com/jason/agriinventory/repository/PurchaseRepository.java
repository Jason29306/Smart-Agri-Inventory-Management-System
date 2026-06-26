package com.jason.agriinventory.repository;

import com.jason.agriinventory.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository
        extends JpaRepository<Purchase, Integer> {
}