package com.enigma.service.iml;

import com.enigma.entity.Product;
import com.enigma.exceptions.InsufficientQuantityException;
import com.enigma.repository.ProductRepository;
import com.enigma.service.inter.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServicesIml implements ProductServices {

    @Autowired
    ProductRepository productRepository;
    /*
    @Autowired
    RestTemplate restTemplate;*/
    @Override
    public Product save(Product product) {
       return productRepository.save(product);
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAll(String keyword, String qty) {

        return productRepository.findAllByProductNameAndQtyIsLessThanEqual(keyword, qty);
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
        if (product.getQty()<=qty){
            throw new InsufficientQuantityException();
        }
        product.deductQuantity(qty);
        save(product);
    }

    @Override
    public BigDecimal getProductPriceById(String id) {
        return getProduct(id).getPrice();
    }
}
