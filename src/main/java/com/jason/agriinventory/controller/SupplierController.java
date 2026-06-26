package com.jason.agriinventory.controller;

import com.jason.agriinventory.entity.Supplier;
import com.jason.agriinventory.repository.SupplierRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
@CrossOrigin("*")
public class SupplierController {

    private final SupplierRepository repository;

    public SupplierController(SupplierRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Supplier addSupplier(
            @RequestBody Supplier supplier) {

        return repository.save(supplier);
    }

    @GetMapping
    public List<Supplier> getSuppliers() {

        return repository.findAll();
    }
}