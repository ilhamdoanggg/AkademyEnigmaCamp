package com.enigma.services.interfaces;

import com.enigma.entity.Purchesed;
import com.enigma.entity.PurchesedDetail;

import java.util.List;

public interface PurchesedServices {
/*    Purchesed save(Purchesed purchesed);
    Purchesed getPurchesed(String id);
    List<Purchesed> getAllPurchesed(Purchesed purchesed);
    void deletePurchesedById(String id);
    public void purchasing(Purchesed purchesed);
    public Purchesed saveUser(String id, Purchesed purchesed);*/

    Purchesed purchasingDetail(Purchesed purchased );
    //List<Purchesed> getAllPurchase(Purchesed purchesed, PurchesedDetail purchesedDetail);
    List<Purchesed> getAllPurchase();
    Purchesed getPurchasedById(String id);

}
