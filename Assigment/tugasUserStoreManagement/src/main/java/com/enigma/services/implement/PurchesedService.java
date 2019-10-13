package com.enigma.services.implement;

import com.enigma.entity.Purchesed;
import com.enigma.repository.PurchasedRepo;
import com.enigma.services.interfaces.PurchesedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchesedService implements PurchesedServices{
    @Autowired
    PurchasedRepo purchasedRepo;

    @Override
    public Purchesed save(Purchesed purchesed) {
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
}
