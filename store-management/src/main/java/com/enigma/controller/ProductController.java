package com.enigma.controller;

import com.enigma.entity.Product;
import com.enigma.entity.Store;
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
    public List<Product> getAll(){
        return productServices.getAll();
    }
/*
    @GetMapping("/products?productName={keyword}&qty={qty}")
    public List<Product> getAll(@RequestParam String keyword, String qty){
        return productServices.getAll(keyword, qty);
    }*/

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productServices.save(product);
    }

    @GetMapping("store/{id}/producs")
    public List<Product> getProducsByStoreId(@PathVariable Integer id){
        return productServices.getProductByStoreId(id);
    }
    @PostMapping("store/{id}/product")
    public Product SaveProductBYStoreId(@PathVariable Integer id,Product product){
        return productServices.saveProductByStore(id, product);
    }

    @PostMapping("store-save")
    public Store save(@RequestBody Integer id){
        return null;
    }

    @PostMapping("store/{id}/product")
    public Product getProductsByStoreId(@PathVariable Integer id, @RequestBody Product product){
        return productServices.saveProductByStore(id, product);
    }

    @DeleteMapping("product/{id}")
    public void deleteProduct(@PathVariable String id){
        productServices.deleteProduct(id);
    }

}
