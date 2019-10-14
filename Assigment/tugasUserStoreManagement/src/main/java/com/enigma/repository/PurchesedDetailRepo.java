package com.enigma.repository;

import com.enigma.entity.PurchesedDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchesedDetailRepo extends JpaRepository<PurchesedDetail, String > {
}
