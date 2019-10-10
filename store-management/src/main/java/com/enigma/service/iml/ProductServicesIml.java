package com.enigma.service;

import com.enigma.entity.Product;
import com.enigma.repository.ProductRepository;
import com.enigma.service.inter.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServicesIml implements ProductServices {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public void debut(String id, Integer qty) {
        Product product=getProduct(id);
        product.deductQuantity(qty);
        save(product);
    }

    @Override
    public BigDecimal getProductPriceById(String id) {
        return getProduct(id).getPrice();
    }


}
