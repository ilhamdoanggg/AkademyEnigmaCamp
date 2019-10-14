package com.enigma.services.interfaces;

import com.enigma.entity.Store;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StoreServices {
    Store save(Store store);
    Store getStore(String id);
    List<Store>getAll(Store store);
    Page<Store> getAllStore(Pageable pageable, Example<Store> exampleMatcher);
    void deleteStoreById(String id);
//    Page<Store> searchAndPage
//       (String storeName,
//        String address, String phoneNumber,
//        String description, Pageable pageable);
}
