package com.enigma.repository;

import com.enigma.entity.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
@Repository
public interface StoreRepo extends JpaRepository<Store, String>{
   public Page<Store> findAllByStoreNameContainsOrAddressContainsOrDescriptionContainsOrPhoneNumberContains
            (String storeName, String address, String phoneNumber, String description, Pageable pageable);
}
