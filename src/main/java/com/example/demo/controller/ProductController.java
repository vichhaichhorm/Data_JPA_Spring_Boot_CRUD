package com.example.demo.controller;

import com.example.demo.modal.Products;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/addProduct")
    public Products addProduct(@RequestBody Products products){
        return productService.saveProduct(products);
    }

    @PostMapping("/addProducts")
    public List<Products> addProducts(@RequestBody List<Products> productsList){
        return productService.saveProducts(productsList);
    }

    @GetMapping("/getAllProducts")
    public List<Products> findAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Products findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @GetMapping("/getProductByName/{name}")
    public Products findProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Products updateProduct(@RequestBody Products products){
        return productService.updateProduct(products);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProductById(id);
    }

}
