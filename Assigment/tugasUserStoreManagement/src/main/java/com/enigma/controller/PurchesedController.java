package com.enigma.controller;

import com.enigma.entity.Purchesed;
import com.enigma.entity.PurchesedDetail;
import com.enigma.services.interfaces.PurchesedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchesedController {
    @Autowired
    PurchesedServices purchesedServices;

    @GetMapping("purchesed")
    public List<Purchesed> purchesedList(){
        return purchesedServices.getAllPurchase();
    }
    @GetMapping("purchesed/{id}")
    public Purchesed getPurchesedId(@PathVariable String id){
        return purchesedServices.getPurchasedById(id);
    }
    @PostMapping("purchased-save")
    public Purchesed purchasing(@RequestBody Purchesed purchased){
        return purchesedServices.purchasingDetail(purchased);
    }

}
