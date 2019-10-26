package com.enigma.services.implement;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repository.SongRepository;
import com.enigma.services.interfaces.ArtistServices;
import com.enigma.services.interfaces.SongServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SongServiceTest {
    @Autowired
    SongRepository songRepository;
    @Autowired
    SongServices songServices;
    @Autowired
    ArtistServices artistServices;

    @Test
    public void saveSongWithExpectationCreatedSuccsess(){
//        Artist newArtist = new Artist("1iquwuque", "Sorban Akhirat", "serang", new Date());
//        artistServices.saveArtist(newArtist);
        Song newSong = new Song("iwiu83","Aku mah Apa atuh", new Date());
        Song baru = songServices.saveSong(newSong);
        Song lama = songRepository.findById(baru.getId()).get();
        assertEquals(lama, baru);
    }
}
