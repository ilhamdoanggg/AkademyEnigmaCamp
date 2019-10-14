package com.enigma.controller;

import com.enigma.entity.Store;
import com.enigma.services.interfaces.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Page<Store> getAllStoreData(@RequestParam Integer size, @RequestParam Integer page, @RequestBody Store search){
        ExampleMatcher exampleMatcher= ExampleMatcher.matchingAny()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Store> storeExample = Example.of(search, exampleMatcher);
        Pageable pageable = PageRequest.of(page, size);
        return storeServices.getAllStore(pageable, storeExample);
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
