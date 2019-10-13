package com.enigma.services.implement;

import com.enigma.entity.Store;
import com.enigma.repository.StoreRepo;
import com.enigma.services.interfaces.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreService implements StoreServices {

    @Autowired
    StoreRepo storeRepo;

    @Override
    public Store save(Store store) {
        return storeRepo.save(store);
    }
    @Override
    public Store getStore(String id) {
        if (!storeRepo.findById(id).isPresent()){
            return new Store();
        }
        return storeRepo.findById(id).get();
    }
    @Override
    public List<Store> getAllStore(Store store) {
        return storeRepo.findAll();
    }
    @Override
    public void deleteStoreById(String id) {
        storeRepo.deleteById(id);
    }
}
