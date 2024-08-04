package com.example.demo.repository;

import com.example.demo.modal.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {
    Products findByName(String name);
}

