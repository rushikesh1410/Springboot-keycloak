package com.product.Key_Cloak_SpringBoot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.Key_Cloak_SpringBoot1.entity.Product;
import com.product.Key_Cloak_SpringBoot1.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.findById(id);
    }
    
}
