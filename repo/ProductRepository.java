package com.product.Key_Cloak_SpringBoot1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.Key_Cloak_SpringBoot1.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
