package com.enigma.services.interfaces;

import com.enigma.entity.Purchesed;

import java.util.List;

public interface PurchesedServices {
    Purchesed save(Purchesed purchesed);
    Purchesed getPurchesed(String id);
    List<Purchesed> getAllPurchesed(Purchesed purchesed);
    void deletePurchesedById(String id);
    public void purchasing(Purchesed purchesed);
    public Purchesed saveUser(String id, Purchesed purchesed);
}
