package com.jason.agriinventory.controller;

import com.jason.agriinventory.entity.Purchase;
import com.jason.agriinventory.repository.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
@CrossOrigin("*")
public class PurchaseController {

    private final PurchaseRepository repository;

    public PurchaseController(PurchaseRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Purchase addPurchase(
            @RequestBody Purchase purchase) {

        return repository.save(purchase);
    }

    @GetMapping
    public List<Purchase> getPurchases() {

        return repository.findAll();
    }
}