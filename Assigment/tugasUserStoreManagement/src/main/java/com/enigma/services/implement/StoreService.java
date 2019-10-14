package com.enigma.services.implement;

import com.enigma.entity.Product;
import com.enigma.entity.Store;
import com.enigma.repository.StoreRepo;
import com.enigma.services.interfaces.StoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreService implements StoreServices {

    @Autowired
    StoreRepo storeRepo;

    @Override
    public Store save(Store store) {
        for (Product product: store.getProducts()) {
            product.setStoreId(store);
        }
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
    public Page<Store> getAllStore(Pageable pageable, Example<Store> exampleMatcher) {
        return storeRepo.findAll(exampleMatcher, pageable);
    }
    /*    @Override
    public Page<Store> getAllStore(Pageable pageable, String keyword) {
        return storeRepo.findAllByStoreNameContainsOrAddressContainsOrDescriptionContainsOrPhoneNumberContains(keyword, keyword, keyword, keyword, pageable);
    }*/
    /*
    public List<Store> getAllStore(Store store) {
        return storeRepo.findAll();
    }*/
    @Override
    public void deleteStoreById(String id) {
        storeRepo.deleteById(id);
    }



}
