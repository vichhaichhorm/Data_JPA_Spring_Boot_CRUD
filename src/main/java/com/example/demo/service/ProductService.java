package com.example.demo.service;

import com.example.demo.modal.Products;
import com.example.demo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Products saveProduct(Products products){
        return productRepository.save(products);
    }

    public List<Products> saveProducts(List<Products> productsList){
        return productRepository.saveAll(productsList);
    }

    public List<Products> getProducts(){
        return productRepository.findAll();
    }
    public Products getProductById(int id){
        return productRepository.findById(id).orElse(null);
    }

    public Products getProductByName(String name){
        return productRepository.findByName(name);
    }

    public String deleteProductById(int id){
        productRepository.deleteById(id);
        return "Your product removed!!" + id;
    }
    public Products updateProduct(Products products) {
        Products existingProduct = productRepository.findById(products.getId()).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(products.getName());
            existingProduct.setQty(products.getQty());
            existingProduct.setPrice(products.getPrice());
            return productRepository.save(existingProduct);
        } else {
            return null;
        }
    }

}
