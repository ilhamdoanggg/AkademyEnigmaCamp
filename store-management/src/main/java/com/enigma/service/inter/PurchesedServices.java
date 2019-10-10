package com.enigma.service;

import com.enigma.entity.Purchesed;

import java.util.List;

public interface PurchesedServices {
    public void save(Purchesed purchesed);
    public Purchesed getPurchesed(String id);
    public List<Purchesed> getAll(Purchesed purchesed);
    public void deletePurchesed(String id);
}
