package com.jason.agriinventory.repository;

import com.jason.agriinventory.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository
        extends JpaRepository<Supplier,Integer> {
}