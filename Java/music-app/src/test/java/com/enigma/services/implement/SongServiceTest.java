package com.enigma.services.implement;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repository.SongRepository;
import com.enigma.services.interfaces.ArtistServices;
import com.enigma.services.interfaces.SongServices;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * The type Song service test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SongServiceTest {
    /**
     * The Song repository.
     */
    @Autowired
    SongRepository songRepository;
    /**
     * The Song services.
     */
    @Autowired
    SongServices songServices;
    /**
     * The Artist services.
     */
    @Autowired
    ArtistServices artistServices;

    /**
     * Save song with expectation created succsess.
     */
    @Test
    public void saveSongWithExpectationCreatedSuccsess(){
        Artist newArtist = new Artist( "Sorban Akhirat", "serang", new Date());
        artistServices.saveArtist(newArtist);
        Song newSong = new Song("Aku mah Apa atuh", new Date(), newArtist.getId());
        newSong = songServices.saveSong(newSong);
        Song songBaru = songServices.getSongById(newSong.getId());
        Song songLama = songRepository.findById(songBaru.getId()).get();
        assertEquals(songLama, songBaru);
    }

    /**
     * Get all data must assert equals have 2.
     */
    @Test
    public void getAllDataMustAssertEqualsHave2(){
        Artist newArtist = new Artist( "Sorban Akhirat", "serang", new Date());
        artistServices.saveArtist(newArtist);
        Song newSong = new Song("Aku mah Apa atuh", new Date(), newArtist.getId());
        Song newSongNew = new Song("kangen mantan mu", new Date(), newArtist.getId());
        newSong = songServices.saveSong(newSong);
        newSongNew = songServices.saveSong(newSongNew);
        assertEquals(2, songRepository.findAll().size());
    }

    /**
     * Should get data song must true with id by self.
     */
    @Test
    public void shouldGetDataSongMustTrueWithIdBySelf(){
        Artist newArtist = new Artist( "Sorban Akhirat", "serang", new Date());
        artistServices.saveArtist(newArtist);
        Song newSong = new Song("Aku mah Apa atuh", new Date(), newArtist.getId());
        songServices.saveSong(newSong);
        songRepository.findById(newSong.getId());
        String getId = newSong.getId();
        assertEquals(getId, newSong.getId());
    }

    /**
     * Should delete success when data song is empety.
     */
    @Test
    public void shouldDeleteSuccessWhenDataSongIsEmpety(){
        Artist newArtist = new Artist( "Sorban Akhirat", "serang", new Date());
        artistServices.saveArtist(newArtist);
        Song newSong = new Song("Aku mah Apa atuh", new Date(), newArtist.getId());
        newSong = songServices.saveSong(newSong);
        songServices.saveSong(newSong);
        songServices.deleteSongById(newSong.getId());
        assertTrue(!songRepository.findById(newSong.getId()).isPresent());
    }

}
