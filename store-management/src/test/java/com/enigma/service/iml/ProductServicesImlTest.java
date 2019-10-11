package com.enigma.service.iml;

import com.enigma.entity.Product;
import com.enigma.repository.ProductRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.BigInteger;

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

    /*
    * positive scenario
    * */

    @Test
    public void productSaveWhenDataProductExceptionCreatedTrue(){
        Product product = new Product("Suriken",10, BigDecimal.valueOf(100));
        Product result = productRepository.save(product);
        Product ygDiCari = productRepository.findById(result.getId()).get();
        assertEquals(result, ygDiCari);
    }

    @Test
    public void productGetAllProductMustTrueWhenSizeEquals3(){
        Product product = new Product("Suriken",10, BigDecimal.valueOf(100));
        Product product2 = new Product("Poition",10, BigDecimal.valueOf(1000));
        Product product3 = new Product("Ganja",10, BigDecimal.valueOf(1000000));
        productRepository.save(product);
        productRepository.save(product2);
        productRepository.save(product3);
        assertEquals(3, productRepository.findAll().size());
    }

    @Test
    public void productGetIdShouldTrue(){
        Product product = new Product("Suriken",10, BigDecimal.valueOf(100));
        productRepository.save(product);
        productRepository.findById(product.getId());
        String getId = product.getId();
        assertEquals(getId, product.getId());
    }

    @Test
    public void testDeleteProductShouldTrue(){
        Product product = new Product("Suriken",10, BigDecimal.valueOf(100));
        productRepository.save(product);
        productRepository.delete(product);
        assertTrue(productRepository.findAll().isEmpty());
    }

    @Test
    public void paymentShouldBigDecimalDataType(){
        BigDecimal bigDecimal = new BigDecimal(100);
        Product product = new Product("Suriken",10, bigDecimal);
        productRepository.save(product);
        assertEquals(productRepository.findById(product.getId()).get().getPrice(),
                new BigDecimal("100.00"));
    }
    @Test
    public void paymentMustHaveMoneyToPayProductItems(){
        BigDecimal bigDecimal = new BigDecimal(100);
        Product product = new Product("Suriken",10, bigDecimal);
        productRepository.save(product);
    }


    /*
    * negative skenario
    * */
    @Test
    public void testDeleteWhenProductFalse(){
        Product product = new Product("Suriken",10, BigDecimal.valueOf(100));
        productRepository.save(product);
        productRepository.deleteAll();
        assertFalse(productRepository.findById(product.getId()).isPresent());
    }

    @After
    public void deleteAll(){
        productRepository.deleteAll();
    }
}
