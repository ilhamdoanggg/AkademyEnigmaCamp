package com.enigma.service;

import com.enigma.entity.Purchesed;
import com.enigma.repository.ProductRepository;
import com.enigma.repository.PurchesedRepo;
import com.enigma.service.inter.PurchesedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchesedServicesIml implements PurchesedServices {

    @Autowired
    PurchesedRepo purchesedRepo;
    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Purchesed purchesed) {
        purchesedRepo.save(purchesed);
    }

    @Override
    public Purchesed getPurchesed(String id) {
        return purchesedRepo.findById(id).get();
    }

    @Override
    public List<Purchesed> getAll(Purchesed purchesed) {
        return purchesedRepo.findAll();
    }

    @Override
    public void deletePurchesed(String id) {
        purchesedRepo.deleteById(id);
    }
}
