package com.enigma.services.implement;


import com.enigma.entity.Product;
import com.enigma.entity.Store;
import com.enigma.exceptions.InsufficientQuantityException;
import com.enigma.repository.ProductRepo;
import com.enigma.services.interfaces.ProductServices;
import com.enigma.services.interfaces.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService implements ProductServices {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    StoreServices storeServices;

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }
    @Override
    public Product getProductId(String id) {
        if (!productRepo.findById(id).isPresent()){
            return new Product();
        }
        return productRepo.findById(id).get();
    }
    @Override
    public void deleteProduct(String id) {
        productRepo.deleteById(id);
    }

    @Override
    public BigDecimal getProductPriceById(String id) {
        return getProductId(id).getPrice();
    }

    @Override
    public void deduct(String id, Integer qty)  {
        Product product=getProductId(id);
        if (product.getQty()<=qty){
            throw new InsufficientQuantityException();
        }
        product.deductQuantity(qty);
        save(product);
    }

    @Override
    public Product saveProductByStore(String id, Product product) {
        Store store = storeServices.getStore(id);
        product.setStoreId(store);
        return productRepo.save(product);
    }

    @Override
    public List<Product> getProductByStoreId(String id) {
        Store store = storeServices.getStore(id);
        return store.getProducts();
    }

    @Override
    public Page<Product> getAllPage(Pageable pageable) {
        return productRepo.findAll(pageable);
    }
}
