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

    /*
    * positive scenario
    * */

    @Test
    public void storeSaveExceptionCreated(){
        Store newStore= new Store("asa",
                "asas","asada","sdada");
        Store result =storeRepository.save(newStore);
        Store ygDiCari = storeRepository.findById(result.getId()).get();
        assertEquals(result, ygDiCari);
    }

    @Test
    public void storeGetIdStoreShouldTrue(){
        Store newStore = new Store("asad",
                "asdad","sdad","sad");
        storeRepository.save(newStore);
        storeRepository.findById(newStore.getId());
        Integer getId = newStore.getId();
        assertEquals(getId,newStore.getId());
    }

    @Test
    public void storeGetAllStoreShouldTrueWhenSizeEquals2(){
        Store newStore = new Store("asad",
                "asdad","sdad","sad");
        Store newStores = new Store("asadasd",
                "klsakda dabdabdabsd",
                "amsdad sdjajdkbaasjkdbajkd","sad");
        storeRepository.save(newStores);
        storeRepository.save(newStore);
        assertEquals(2, storeRepository.findAll().size());
    }

    @Test
    public void testDeleteStoreShouldTrue() throws Exception{
        Store newStore = new Store("asad",
                "asdad","sdad","sad");
        //when(newStore.getId(any())).thenReturn();
        storeRepository.save(newStore);
        storeRepository.delete(newStore);
        assertTrue(storeRepository.findAll().isEmpty());
    }

    /*
    * Negative Skenario
    * */
    @Test
    public void testDeleteStoreFalse() throws Exception{
        Store newStore = new Store("asad",
                "asdad","sdad","sad");
        //when(newStore.getId(any())).thenReturn();
        storeRepository.save(newStore);
        storeRepository.delete(newStore);
        assertFalse(storeRepository.findById(newStore.getId())
                .isPresent());
    }

   /* @Test
    public void storeSaveExceptionCreatedFailedWhenNameStoreIsEmty(){
        Store newStore= new Store("asasda",
                "sdasda","asdads","asdad");
        //when(storeRepository.save(any(Store.class))).thenReturn(new );
        storeRepository.save(newStore);
        //storeRepository.deleteAll();
        storeRepository.findById(newStore.getId()).get();
        (newStore.getStoreName()).isSameAs;
    }*/

    @After
    public void deleteData(){
        storeRepository.deleteAll();
    }
}
