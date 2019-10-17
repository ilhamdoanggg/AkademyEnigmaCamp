package com.enigma.repository;

import com.enigma.entity.Purchesed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchasedRepo extends JpaRepository<Purchesed, String >, JpaSpecificationExecutor {
}
