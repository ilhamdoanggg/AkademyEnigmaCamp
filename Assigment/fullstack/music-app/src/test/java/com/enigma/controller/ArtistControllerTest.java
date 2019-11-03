package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepository;
import com.enigma.services.interfaces.ArtistServices;
import com.fasterxml.jackson.core.type.TypeReference;
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
    /**
     * The Mock mvc.
     */
    @Autowired
    MockMvc mockMvc;
    /**
     * The Artist services.
     */
    @Autowired
    ArtistServices artistServices;
    /**
     * The Artist repository.
     */
    @Autowired
    ArtistRepository artistRepository;

    /**
     * The Object mapper.
     */
    @Autowired
    ObjectMapper objectMapper;

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
     * Shoul return size equals to one artis when one artis saved.
     *
     * @throws Exception the exception
     */
//    @Test
//    public void shoulReturnSizeEqualsToOneArtisWhenOneArtisSaved()throws Exception{
////        List<Artist> artists = new ArrayList<>();
//        Artist artist= new Artist( "Kangen Band", "Lampung", new Date());
//        Artist artist1= new Artist( "Kangen Band", "Lampung", new Date());
//        Artist artist2= new Artist( "Kangen Band", "Lampung", new Date());
//        artistRepository.save(artist);
//        artistRepository.save(artist1);
//        artistRepository.save(artist2);
//
//       // when(artistRepository.findAll()).thenReturn(artists);
//
//        String  result= mockMvc.perform(MockMvcRequestBuilders.get("/artists")
//                .contentType(MediaType.APPLICATION_JSON)).andReturn().getResponse().getContentAsString();
//        System.out.println(result);
//        List<Artist>recivedList = objectMapper.readValue(result, new TypeReference<List<Artist>>() {});
//
//        assertEquals(3, recivedList.size());
//
//    }

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
