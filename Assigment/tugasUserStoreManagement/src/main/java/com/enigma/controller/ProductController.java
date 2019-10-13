package com.enigma.controller;

import com.enigma.entity.Product;
import com.enigma.services.interfaces.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductServices productServices;

    @GetMapping("product/{id}")
    public Product getProductById(@PathVariable String id){
        return productServices.getProductId(id);
    }
    @GetMapping("products")
    public List<Product> getAllProducts(Product product){
        return productServices.getAllProduct(product);
    }
    @PostMapping("product")
    public Product saveNewProductById(@RequestBody Product product){
        return productServices.save(product);
    }
    @DeleteMapping("product/{id}")
    public void deleteProductById(@PathVariable String id){
        productServices.deleteProduct(id);
    }
}
