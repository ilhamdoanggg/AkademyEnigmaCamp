package com.enigma.services.interfaces;

import com.enigma.entity.Store;

import java.util.List;

public interface StoreServices {
    Store save(Store store);
    Store getStore(String id);
    List<Store> getAllStore(Store store);
    void deleteStoreById(String id);
}
