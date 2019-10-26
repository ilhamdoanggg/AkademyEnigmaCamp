package com.enigma.service.inter;

import com.enigma.entity.Product;
import com.enigma.entity.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.List;

public interface ProductServices {
    public Product save(Product product);
    //public Product save(Integer id, Product product);
    public Product getProduct(String id);
    public List<Product> getAll(String keyword, String qty);
    public List<Product> getAll();
    public Page<Product> getAllPage(Pageable pageable);

    //public List<Product> getProductByName();
    public void deleteProduct(String id);
    public void deduct(String id, Integer qty);
    public BigDecimal getProductPriceById(String id);
    public Product saveProductByStore(Integer id, Product product);
    public List<Product> getProductByStoreId(Integer id);

}
