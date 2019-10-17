package com.enigma.services.interfaces;

import com.enigma.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.List;

public interface ProductServices {
    Product save(Product product);
    Product getProductId(String id);
    List<Product> getAllProduct(Product product);
    void deleteProduct(String id);
    BigDecimal getProductPriceById(String id);
    public void deduct(String id, Integer qty);
    Product saveProductByStore(String id, Product product);
    List<Product> getProductByStoreId(String id);
    //Page<Product> getAllPage(Pageable pageable);
}
