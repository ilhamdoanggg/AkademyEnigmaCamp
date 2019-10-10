package com.enigma.service.iml;

import com.enigma.entity.Store;
import com.enigma.repository.StoreRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreServicesImlTest {

    @Autowired
    StoreRepository storeRepository;

    @Before
    public void cleanUpDb(){
        storeRepository.deleteAll();
    }

    @Test
    public void storeSaveExceptionCreated(){
        Store newStore= new Store("asa",
                "asas","asada","sdada");
        Store result =storeRepository.save(newStore);
        Store ygDiCari = storeRepository.findById(result.getId()).get();
        assertEquals(result, ygDiCari);
    }

    @Test
    public void storeGetAllProductShouldTrueWhenSizeEquals2(){
        Store newStore = new Store("asad",
                "asdad","sdad","sad");
        Store newStores = new Store("asadasd",
                "klsakda dabdabdabsd","amsdad sdjajdkbaasjkdbajkd","sad");
        storeRepository.save(newStores);
        storeRepository.save(newStore);
        assertEquals(2, storeRepository.findAll().size());
    }

    @After
    public void deleteData(){
        storeRepository.deleteAll();
    }

//
//    @Test
//    public void
}
