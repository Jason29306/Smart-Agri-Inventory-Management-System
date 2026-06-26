package com.jason.agriinventory.controller;

import com.jason.agriinventory.entity.Sales;
import com.jason.agriinventory.repository.SalesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin("*")
public class SalesController {

    private final SalesRepository repository;

    public SalesController(SalesRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Sales addSale(@RequestBody Sales sales) {
        return repository.save(sales);
    }

    @GetMapping
    public List<Sales> getSales() {
        return repository.findAll();
    }
}