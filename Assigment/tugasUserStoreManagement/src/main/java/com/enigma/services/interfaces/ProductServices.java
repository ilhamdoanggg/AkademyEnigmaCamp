package com.enigma.services.interfaces;

import com.enigma.entity.Product;

import java.util.List;

public interface ProductServices {
    Product save(Product product);
    Product getProductId(String id);
    List<Product> getAllProduct(Product product);
    void deleteProduct(String id);
}
