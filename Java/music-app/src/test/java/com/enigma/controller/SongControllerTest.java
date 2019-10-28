package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repository.SongRepository;
import com.enigma.services.interfaces.ArtistServices;
import com.enigma.services.interfaces.SongServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The type Song controller test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SongControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    SongServices songServices;
    @Autowired
    SongRepository songRepository;
    @Autowired
    ArtistServices artistServices;
    @Autowired
    ObjectMapper objectMapper;
    static Pageable pageable= PageRequest.of(0,10);

    /**
     * Save data artist should true by id.
     *
     * @throws Exception the exception
     */
    @Test
    public void saveDataArtistShouldTrueById() throws Exception{
        Artist artist= new Artist("Kangen Band", "Lampung", new Date());
        artist= artistServices.saveArtist(artist);
        Song song = new Song("Kangen mantannya mantan mu", new Date(), artist.getId());
        mockMvc.perform(post("/song")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(song)))
                .andExpect(status().isOk());
    }

    /**
     * Gets data should true.
     *
     * @throws Exception the exception
     */
    @Test
    public void getDataShouldTrue() throws Exception {
        Artist artist= new Artist("Kangen Band", "Lampung", new Date());
        artist= artistServices.saveArtist(artist);
        Song song = new Song("Kangen mantannya mantan mu", new Date(), artist.getId());
        song= songRepository.save(song);
        String respon = mockMvc.perform(post("/song")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(song)))
                .andReturn().getResponse().getContentAsString();
        Song expect = new ObjectMapper().readValue(respon, Song.class);
        Assert.assertEquals(expect, songRepository.findById(song.getId()).get());
    }
    /*
    * buang waktu
    * */
/*    @Test
    public void getAllDataSongShouldReturnFromDatabase() throws Exception {
        Artist artist= new Artist("Kangen Band", "Lampung", new Date());
        artist= artistServices.saveArtist(artist);
        Song song = new Song("Kangen mantannya mantan mu", new Date(), artist.getId());
        Song songNew = new Song("Kangen mantannya mantan mu", new Date(), artist.getId());
        Song songOld = new Song("Kangen mantannya mantan mu", new Date(), artist.getId());
        song= songRepository.save(song);
        songNew=songRepository.save(songNew);
        songOld=songRepository.save(songOld);
        List<Song> songList = new ArrayList<>();
        songList.add(song);
        songList.add(songNew);
        songList.add(songOld);
        String respon =
                *//*mockMvc.perform(get("/songs")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(songList)))
                .andReturn().getResponse().getContentAsString();*//*
        Song expect = new ObjectMapper().readValue(respon, Song.class);
        Assert.assertEquals(expect, songRepository.findAll(pageable));
    }*/
}
