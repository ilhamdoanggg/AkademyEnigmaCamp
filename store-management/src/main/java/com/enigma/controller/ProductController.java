package com.enigma.controller;

import com.enigma.entity.Product;
import com.enigma.service.inter.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductServices productServices;

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable String id){
        return productServices.getProduct(id);
    }

    @GetMapping("/products")
    public List<Product> getAll(Product product){
        return productServices.getAll();
    }
    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productServices.save(product);
    }
}
