package com.enigma.repository;

import com.enigma.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepo extends JpaRepository<Store, String > {
}
