package com.example.sample.service;

import com.example.sample.exception.ResourceNotFoundException;
import com.example.sample.model.Product;
import com.example.sample.repo.ProductRepo;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProductService {
    private final ProductRepo repo;


    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }


    public List<Product> getAll() {
        return repo.findAll();
    }


    public Product getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + id));
    }


    public Product create(Product product) {
        product.setId(null);
        return repo.save(product);
    }


    public Product update(Long id, Product product) {
        Product existing = getById(id);
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        return repo.save(existing);
    }


    public void delete(Long id) {
        Product existing = getById(id);
        repo.delete(existing);
    }
}
