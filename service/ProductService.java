package com.product.Key_Cloak_SpringBoot1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Key_Cloak_SpringBoot1.entity.Product;
import com.product.Key_Cloak_SpringBoot1.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	//all products
	public List<Product> findAll() {
        return productRepository.findAll();
    }

	// product by id
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // save product
    public Product save(Product product) {
        return productRepository.save(product);
    }

    //delete by id
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
	
}
