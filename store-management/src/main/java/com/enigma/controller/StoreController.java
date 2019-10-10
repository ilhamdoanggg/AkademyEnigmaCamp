package com.enigma.controller;

import com.enigma.entity.Store;
import com.enigma.service.inter.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {

    @Autowired
    StoreServices storeServices;

    @GetMapping("/store/{id}")
    public Store getStoreById(@PathVariable Integer id) {
        return storeServices.getStore(id);
    }

    @GetMapping("/stores")
    public List<Store> getAll(Store store) {
        return storeServices.getAll(store);
    }

    @PostMapping("/store")
    public Store saveStore(@RequestBody Store store) {
        return storeServices.save(store);
    }
}

/*

    @GetMapping("/store")
    public Store getStoreById(Store store){
        storeServices.

    }

    @PostMapping("/store/banyak")
    public void saveStoreBanyak(@RequestBody List<Store> stores){
        storeServices.save(stores);
    }
*/
