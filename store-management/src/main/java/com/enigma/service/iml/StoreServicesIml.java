package com.enigma.service;

import com.enigma.entity.Store;
import com.enigma.repository.StoreRepository;
import com.enigma.service.inter.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServicesIml implements StoreServices {

    @Autowired
    StoreRepository storeRepository;

    @Override
    public Store getStore(Integer id) {
        return storeRepository.findById(id).get();
    }

    @Override
    public List<Store> getAll(Store store) {
        return storeRepository.findAll();
    }


    @Override
    public List<Store> searcheByName(String name) {
        return null;
    }

    @Override
    public void save(Store store) {
        storeRepository.save(store);
    }
}
