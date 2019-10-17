package com.enigma.repository;

import com.enigma.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, String >, JpaSpecificationExecutor {

    public List<Product> findAllByProductNameContains(String Keyword);
}
