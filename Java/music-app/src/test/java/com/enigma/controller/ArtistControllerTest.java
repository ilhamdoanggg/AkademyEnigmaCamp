package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepository;
import com.enigma.services.interfaces.ArtistServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
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
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

    @Test
    public void getAllDataArtist()throws Exception{
        List<Artist> artists=new ArrayList<>();
        artists.add(new Artist( "Kangen Band", "Lampung", new Date()));
        artists.add(new Artist( "Kris sakti", "Kali deres", new Date()));
        artists.add(new Artist( "Anak Kambing Makan Ayam Goreng", "Neraka", new Date()));
        when(artistRepository.findAll()).thenReturn(artists);
        mockMvc.perform(MockMvcRequestBuilders.get("/artists")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("", hasSize(3))).andDo(print());
    }
    @Test
    public void getDataByIdShouldTrue()throws Exception{
        Artist artist= new Artist("Kangen Band", "Lampung", new Date());
        mockMvc.perform(MockMvcRequestBuilders.get("/artist/{id}",1)
                .accept(MediaType.APPLICATION_JSON)).andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(artist.getId()));
    }

}
