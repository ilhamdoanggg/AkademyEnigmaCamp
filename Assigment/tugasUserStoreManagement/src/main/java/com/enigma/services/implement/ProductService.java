package com.enigma.services.implement;

import com.enigma.entity.Product;
import com.enigma.repository.ProductRepo;
import com.enigma.services.interfaces.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements ProductServices {
    @Autowired
    ProductRepo productRepo;

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
    public List<Product> getAllProduct(Product product) {
        return productRepo.findAll();
    }
    @Override
    public void deleteProduct(String id) {
        productRepo.deleteById(id);
    }
}
