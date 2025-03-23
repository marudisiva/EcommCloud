package com.siva.cloudecart.service;

import com.siva.cloudecart.entity.Product;
import com.siva.cloudecart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> saveProducts(List<Product> product) {
        return productRepository.saveAll(product);
    }
}
