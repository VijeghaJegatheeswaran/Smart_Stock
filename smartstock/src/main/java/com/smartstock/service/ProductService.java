package com.smartstock.service;

import com.smartstock.model.Product;
import com.smartstock.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }

    public Product updateProduct(Long id, Product product) {
        product.setId(id);
        return repo.save(product);
    }
}
