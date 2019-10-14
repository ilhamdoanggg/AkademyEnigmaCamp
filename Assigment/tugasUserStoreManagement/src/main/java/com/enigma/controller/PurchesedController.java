package com.enigma.controller;

import com.enigma.entity.Purchesed;
import com.enigma.services.interfaces.PurchesedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchesedController {
    @Autowired
    PurchesedServices purchesedServices;

    @GetMapping("purchesed/{id}")
    public Purchesed getPurchesedById(@PathVariable String id){
        return purchesedServices.getPurchesed(id);
    }
    @GetMapping("purcheseds")
    public List<Purchesed> getAllPurchesed(Purchesed purchesed){
        return purchesedServices.getAllPurchesed(purchesed);
    }
    @PostMapping("purchesed")
    public Purchesed saveNewPurchesed(@RequestBody Purchesed purchesed){
        return purchesedServices.save(purchesed);
    }
    @DeleteMapping("purchesed")
    public void deletePurchesedById(@PathVariable String id){
        purchesedServices.deletePurchesedById(id);
    }
    @PostMapping("user/{id}/purchesed")
    public Purchesed postUserByStoroId(@PathVariable String id, @RequestBody Purchesed purchesed){
        return purchesedServices.saveUser(id, purchesed);
    }
}
