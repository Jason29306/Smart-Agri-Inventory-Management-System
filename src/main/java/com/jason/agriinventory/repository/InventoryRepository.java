package com.jason.agriinventory.repository;

import com.jason.agriinventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository
        extends JpaRepository<Inventory,Integer> {
}