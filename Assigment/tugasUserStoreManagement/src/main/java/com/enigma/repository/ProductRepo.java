package com.enigma.repository;

import com.enigma.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, String > {

    public List<Product> findAllByProductNameContains(String Keyword);
}
