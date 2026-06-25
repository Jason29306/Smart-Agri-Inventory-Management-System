package com.jason.agriinventory.controller;

import com.jason.agriinventory.entity.Product;
import com.jason.agriinventory.repository.ProductRepository;
import com.jason.agriinventory.dto.DashboardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Integer id,
                                 @RequestBody Product updatedProduct) {

        Product product = repository.findById(id).orElseThrow();

        product.setProductName(updatedProduct.getProductName());
        product.setCategory(updatedProduct.getCategory());
        product.setQuantity(updatedProduct.getQuantity());
        product.setPrice(updatedProduct.getPrice());
        product.setSupplier(updatedProduct.getSupplier());

        return repository.save(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id) {

        repository.deleteById(id);

        return "Product Deleted Successfully";
    }
    @GetMapping("/search/{name}")
    public List<Product> searchProduct(@PathVariable String name) {
        return repository.findByProductNameContainingIgnoreCase(name);
    }
    @GetMapping("/low-stock")
    public List<Product> lowStockProducts() {
        return repository.findByQuantityLessThan(10);
    }
    @GetMapping("/dashboard")
    public DashboardResponse dashboard() {

        long totalProducts = repository.count();

        long lowStockProducts =
                repository.findByQuantityLessThan(10).size();

        return new DashboardResponse(
                totalProducts,
                lowStockProducts
        );
    }
}