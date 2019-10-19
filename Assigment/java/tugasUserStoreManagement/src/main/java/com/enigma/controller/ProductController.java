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

    @CrossOrigin
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
    @GetMapping("store/{id}/product")
    public List<Product> getstorrebyidandProduct(@PathVariable String id){
        return productServices.getProductByStoreId(id);
    }
    @PostMapping("store/{id}/products")
    public Product getProductByStoreId(@PathVariable String id,@RequestBody Product product){
        return productServices.saveProductByStore(id, product);
    }

/*
    @GetMapping("products")
    public Page<Product> getALlPage(@RequestParam Integer size, @RequestParam Integer page){
        Pageable pageable = PageRequest.of(page, size);
        return productServices.getAllPage(pageable);
    }*/
}
