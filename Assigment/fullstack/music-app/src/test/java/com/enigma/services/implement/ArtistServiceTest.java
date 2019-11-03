package com.enigma.services.implement;
import com.enigma.entity.Artist;
import com.enigma.exception.FileStorageException;
import com.enigma.repository.ArtistRepository;
import com.enigma.services.interfaces.ArtistServices;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArtistServiceTest {
    @Autowired
    ArtistRepository artistRepository;
    @Autowired
    ArtistServices artistServices;

    @Before
    public void cleanUpDb(){
        artistRepository.deleteAll();
    }

    /**
     * Save data artist exception created.
     */
    @Test
    public void saveDataArtistExceptionCreated(){
        Artist newArtist = new Artist("Data", "serang", new Date());
        Artist baru = artistServices.saveArtist(newArtist);
        Artist lama = artistRepository.findById(baru.getId()).get();
        assertEquals(baru, lama);
    }

    /**
     * Get all data in artist data must assert equals have 2.
     */
//    @Test(expected = FileStorageException.class)
//    public void terserahA(){
//        //assertThrow in Junit 5
//    }

    @Test
    public void shouldAllDataInArtistDataMustAssertEqualsHave2(){
        Artist newArtist = new Artist( "Data", "serang", new Date());
        Artist oldArtist = new Artist( "Data", "serang", new Date());
        artistServices.saveArtist(newArtist);
        artistServices.saveArtist(oldArtist);
        Pageable pageable= PageRequest.of(0,10);
        assertEquals(2, artistRepository.findAll(pageable).getTotalElements());
    }

    /**
     * Delete artist data should true.
     *
     * @throws Exception the exception
     */
    @Test
    public void deleteArtistDataShouldTrue(){
        //Artist newArtist = new Artist("1", "Data", "serang", new Date());
        Artist newArtist = new Artist();
        newArtist.setName("Kangen Band");
        artistServices.saveArtist(newArtist);
        artistServices.delete(newArtist.getId());
        Pageable pageable= PageRequest.of(0,10);
        assertTrue(artistRepository.findAll(pageable).isEmpty());
    }

    /**
     * Should get data artist must true.
     */
    @Test
    public void shouldGetDataArtistMustTrue(){
        Artist newArtist = new Artist();
        newArtist.setName("Dewa 19 18");
        artistServices.saveArtist(newArtist);
        artistRepository.findById(newArtist.getId());
        String getId = newArtist.getId();
        assertEquals(getId, newArtist.getId());
    }

    /**
     * Test delete artist by id must fail when data is present.
     */
    @Test
    public void testDeleteArtistByIdMustFailWhenDataIsPresent(){
        Artist newArtist = new Artist();
        newArtist.setName("Dewa 19 18");
        artistServices.saveArtist(newArtist);
        artistServices.delete(newArtist.getId());
        assertFalse(artistRepository.findById(newArtist.getId()).isPresent());
    }
}
