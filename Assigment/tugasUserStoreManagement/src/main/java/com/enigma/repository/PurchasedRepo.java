package com.enigma.repository;

import com.enigma.entity.Purchesed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasedRepo extends JpaRepository<Purchesed, String > {
}
