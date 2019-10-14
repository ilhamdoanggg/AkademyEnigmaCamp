package com.enigma.services.implement;

import com.enigma.entity.Product;
import com.enigma.entity.Purchesed;
import com.enigma.entity.Users;
import com.enigma.repository.PurchasedRepo;
import com.enigma.services.interfaces.ProductServices;
import com.enigma.services.interfaces.PurchesedDetailServices;
import com.enigma.services.interfaces.PurchesedServices;
import com.enigma.services.interfaces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PurchesedService implements PurchesedServices{
    @Autowired
    PurchasedRepo purchasedRepo;
    @Autowired
    UserServices userServices;

    @Autowired
    PurchesedDetailServices purchesedDetailServices;

    @Override
    public Purchesed save(Purchesed purchesed) {
        /*
        Product product = productServices.getProductId(purchesed.getProductId());
        productServices.deduct(product.getId(), purchesed.getQty());
        */
        productServices.deduct(purchesed.getProductId(), purchesed.getQty());
        BigDecimal basePrice = productServices.getProductPriceById(purchesed.getProductId());
        purchesed.setPurchesPrice(basePrice);
        return purchasedRepo.save(purchesed);
    }
    @Override
    public Purchesed getPurchesed(String id) {
     if(!purchasedRepo.findById(id).isPresent()){
         return new Purchesed();
        }
        return purchasedRepo.findById(id).get();
    }
    @Override
    public List<Purchesed> getAllPurchesed(Purchesed purchesed) {
        return purchasedRepo.findAll();
    }
    @Override
    public void deletePurchesedById(String id) {
        purchasedRepo.deleteById(id);
    }
    @Override
    public void purchasing(Purchesed purchesed) {
        productServices.deduct(purchesed.getProductId(), purchesed.getQty());
        BigDecimal basePrice = productServices.getProductPriceById(purchesed.getProductId());
        purchesed.setPurchesPrice(basePrice);
        purchasedRepo.save(purchesed);
    }
    @Override
    public Purchesed saveUser(String id, Purchesed purchesed) {
        Users users = userServices.getUser(id);
        Product product = productServices.getProductId(purchesed.getProductId());
        purchesed.setUserId(users);
        purchesed.setProduct(product);
        productServices.deduct(purchesed.getProductId(), purchesed.getQty());
        BigDecimal basePrice = productServices.getProductPriceById(purchesed.getProductId());
        purchesed.setPurchesPrice(basePrice);
        return purchasedRepo.save(purchesed);
    }
}
