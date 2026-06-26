package com.jason.agriinventory.controller;

import com.jason.agriinventory.entity.Inventory;
import com.jason.agriinventory.repository.InventoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
@CrossOrigin("*")
public class InventoryController {

    private final InventoryRepository repository;

    public InventoryController(InventoryRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Inventory addInventory(
            @RequestBody Inventory inventory) {

        return repository.save(inventory);
    }

    @GetMapping
    public List<Inventory> getInventory() {

        return repository.findAll();
    }
}