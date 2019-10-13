package com.enigma.controller;

import com.enigma.entity.Store;
import com.enigma.services.interfaces.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {
    @Autowired
    StoreServices storeServices;

    @GetMapping("store/{id}")
    public Store getStoreId(@PathVariable String id){
        return storeServices.getStore(id);
    }
    @GetMapping("stores")
    public List<Store> getAllStoreData(Store store){
        return storeServices.getAllStore(store);
    }
    @PostMapping("store")
    public Store saveNewStore(@RequestBody Store store){
        return storeServices.save(store);
    }
    @DeleteMapping("store/{id}")
    public void deleteStoreById(@PathVariable String id){
        storeServices.deleteStoreById(id);
    }
}
