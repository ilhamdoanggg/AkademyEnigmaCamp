package com.enigma.service.iml;

import com.enigma.entity.Purchesed;
import com.enigma.repository.PurchesedRepo;
import com.enigma.service.inter.ProductServices;
import com.enigma.service.inter.PurchesedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PurchesedServicesIml implements PurchesedServices {

    @Autowired
    PurchesedRepo purchesedRepo;
    @Autowired
    ProductServices productServices;

    /*
    * save data
    * */
    @Override
    public void save(Purchesed purchesed) {
        purchesedRepo.save(purchesed);
    }

    /*
    * Get data by ID
    * @Param
    * */
    @Override
    public Purchesed getPurchesed(String id) {
        return purchesedRepo.findById(id).get();
    }

    /*
    * Get All Data in Json*/
    @Override
    public List<Purchesed> getAll(Purchesed purchesed) {
        return purchesedRepo.findAll();
    }

    /*
    * delete data by ID
    * @Param
    * */
    @Override
    public void deletePurchesed(String id) {
        purchesedRepo.deleteById(id);
    }

    /*
    * add data purchese form
    * id product*/
    @Override
    public void purchasing(Purchesed purchesed) {
        productServices.debut(purchesed.getProductId(), purchesed.getQty());
        BigDecimal basePrice = productServices.getProductPriceById(purchesed.getProductId());
        purchesed.setPurchesPrice(basePrice);
        purchesedRepo.save(purchesed);
    }
}
