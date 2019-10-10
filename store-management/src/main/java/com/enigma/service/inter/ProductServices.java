package com.enigma.service;

import com.enigma.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductServices {
    public void save(Product product);
    public Product getProduct(String id);
    public List<Product> getAll();
    public void deleteProduct(String id);
    public void debut(String id, Integer qty);
    public BigDecimal getProductPriceById(String id);

}
