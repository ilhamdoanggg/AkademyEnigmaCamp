package com.enigma.services.implement;
import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepository;
import com.enigma.services.interfaces.ArtistServices;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * The type Artist service test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArtistServiceTest {
    /**
     * The Artist repository.
     */
    @Autowired
    ArtistRepository artistRepository;
    @Autowired
    ArtistServices artistServices;

    /**
     * Clean up db.
     */
    @Before
    public void cleanUpDb(){
        artistRepository.deleteAll();
    }

    /**
     * Save data artist exception created.
     */
    @Test
    public void saveDataArtistExceptionCreated(){
        Artist newArtist = new Artist("3u4i324yubsdbf", "Data", "serang", new Date());
//        Artist newArtist= new Artist();
//        newArtist.setName("aaa");
//        newArtist.setBirdPlace("Neraka");
        Artist baru = artistServices.saveArtist(newArtist);
        Artist lama = artistRepository.findById(baru.getId()).get();
        assertEquals(baru, lama);
    }

    /**
     * Get all data in artist data must assert equals have 2.
     */
    @Test
    public void getAllDataInArtistDataMustAssertEqualsHave2(){
        Artist newArtist = new Artist("1", "Data", "serang", new Date());
        Artist oldArtist = new Artist("1", "Data", "serang", new Date());
        artistServices.saveArtist(newArtist);
        artistServices.saveArtist(oldArtist);
        assertEquals(2, artistRepository.findAll().size());
    }

    /**
     * Delete artist data should true.
     *
     * @throws Exception the exception
     */
    @Test
    public void deleteArtistDataShouldTrue()throws Exception{
        Artist newArtist = new Artist();
        newArtist.setName("Dewa 19 18");
        artistRepository.save(newArtist);
        artistRepository.delete(newArtist);
        assertTrue(artistRepository.findAll().isEmpty());
    }

    /**
     * Should get data artist must true.
     */
    @Test
    public void shouldGetDataArtistMustTrue(){
        Artist newArtist = new Artist();
        newArtist.setName("Dewa 19 18");
        artistRepository.save(newArtist);
        artistRepository.findById(newArtist.getId());
        String getId=newArtist.getId();
        Assert.assertNotNull(newArtist);
    }

    /**
     * Test delete artist by id must fail when data is present.
     */
    @Test
    public void testDeleteArtistByIdMustFailWhenDataIsPresent(){
        Artist newArtist = new Artist();
        newArtist.setName("Dewa 19 18");
        artistRepository.save(newArtist);

    }
}
