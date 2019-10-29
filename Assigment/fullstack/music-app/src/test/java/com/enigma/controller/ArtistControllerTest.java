package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepository;
import com.enigma.services.interfaces.ArtistServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * The type Artist controller test.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ArtistControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ArtistServices artistServices;
    @Autowired
    ArtistRepository artistRepository;

    /**
     * Gets data by id should true.
     *
     * @throws Exception the exception
     */
    @Test
    public void getDataByIdShouldTrue()throws Exception{
        Artist artist= new Artist("Kangen Band", "Lampung", new Date());
        mockMvc.perform(MockMvcRequestBuilders.get("/artist/{id}",1)
                .accept(MediaType.APPLICATION_JSON)).andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(artist.getId()));
    }

    /**
     * Should save new data artist by request body json must success fully.
     *
     * @throws Exception the exception
     */
    @Test
    public void shouldSaveNewDataArtistByRequestBodyJsonMustSuccessFully()throws Exception{
        ObjectMapper objectMapper= new ObjectMapper();
        Artist artist = new Artist("Kangen Band", "Lampung", new Date());
        mockMvc.perform(post("/artist")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(artist)))
                .andExpect(status().isOk());
    }

    /**
     * Save new artist should exist in database.
     *
     * @throws Exception the exception
     */
    @Test
    public void saveNewArtistShouldExistInDatabase()throws Exception{
        ObjectMapper objectMapper= new ObjectMapper();
        Artist artist = new Artist("Kangen Band", "Lampung", new Date());
        String respon = mockMvc.perform(post("/artist")
        .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(artist)))
                .andReturn()
                .getResponse()
                .getContentAsString();
        artist = new ObjectMapper().readValue(respon, Artist.class);
        Assert.assertEquals(artist, artistRepository.findById(artist.getId()).get());
    }

    /**
     * Should get data by id artist api.
     *
     * @throws Exception the exception
     */
    @Test
    public void shouldGetDataByIdArtistApi()throws Exception{
        Artist artist = new Artist("Kangen Band", "Lampung", new Date());
        mockMvc.perform(MockMvcRequestBuilders.get("/artist/{id}",1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers
                        .jsonPath("$.id")
                        .value(artist.getId()));
    }

    /**
     * Gets all data artist.
     *
     * @throws Exception the exception
     */
/*    @Test
    public void getAllDataArtist()throws Exception{
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist( "Kangen Band", "Lampung", new Date()));
        artists.add(new Artist( "Kris sakti", "Kali deres", new Date()));
        artists.add(new Artist( "Anak Kambing Makan Ayam Goreng", "Neraka", new Date()));
        when(artistRepository.findAll()).thenReturn(artists);
        mockMvc.perform(MockMvcRequestBuilders.get("/artists")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", hasSize(3))).andDo(print());
    }*/

//    @Test
//    public void deleteArtistByIdShouldSuccessfully()throws Exception{
//        //mockMvc.perform(delete("/artist/{id}", artistServices))
//        when(artistServices.delete("1")).thenReturn(true);
//
//    }
    /*@Test
    public void shouldDeleteArtistByIdWithAPIMustsuccessfully()throws Exception{
        Artist artist = new Artist("Kangen Band", "Lampung", new Date());
        mockMvc.perform(delete("artist/{id}", 11 )
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(artist));
    }*/
    /*@Test
    public void successfullyCreateNewArtist()throws Exception{
        Artist artist = new Artist("Kangen Band", "Lampung", new Date());
        ObjectMapper objectMapper= new ObjectMapper();
        when()
    }*/

    /**/
}
