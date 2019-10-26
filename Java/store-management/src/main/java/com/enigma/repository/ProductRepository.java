package com.enigma.repository;

import com.enigma.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String > {

    /*
    * Query Method
    * */

    List<Product> findAllByProductNameAndQtyIsLessThanEqual(String producName, String qty);
}
