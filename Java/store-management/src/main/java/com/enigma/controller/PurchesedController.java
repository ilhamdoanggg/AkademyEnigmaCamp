package com.enigma.controller;

import com.enigma.entity.Purchesed;
import com.enigma.service.inter.PurchesedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchesedController {

    @Autowired
    PurchesedServices purchesedServices;

    @GetMapping("/purchese/{id}")
    public Purchesed getPurcheseById(@PathVariable String id){
        return purchesedServices.getPurchesed(id);
    }

    @GetMapping("/purcheseds")
    public List<Purchesed> getALl(Purchesed purchesed){
        return purchesedServices.getAll(purchesed);
    }

    @PostMapping("/purchese")
    public void savePurchesed(@RequestBody Purchesed purchesed){
        purchesedServices.purchasing(purchesed);
    }

}
