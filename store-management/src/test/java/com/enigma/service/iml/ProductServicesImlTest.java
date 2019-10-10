package com.enigma.service.iml;

import com.enigma.repository.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServicesImlTest {
    @Autowired
    ProductRepository productRepository;

    @Before
    public void CleanUPDb(){
        productRepository.deleteAll();
    }

}
