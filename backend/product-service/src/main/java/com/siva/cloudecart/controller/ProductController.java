package com.siva.cloudecart.controller;

import com.siva.cloudecart.entity.Product;
import com.siva.cloudecart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/allProducts")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/saveProducts")
    public List<Product> saveProducts(@RequestBody List<Product> product) {
        return productService.saveProducts(product);
    }
}
