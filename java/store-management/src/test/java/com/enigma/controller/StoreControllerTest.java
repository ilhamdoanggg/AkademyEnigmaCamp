package com.enigma.controller;

import com.enigma.entity.Store;
import com.enigma.repository.StoreRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StoreControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    StoreRepository storeRepository;

    @Test
    public void saveStoreShouldReturnOkStatus() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Store expected = new Store("sdasd","asdada","sadad","sadad");
        mockMvc.perform(post("/store")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(expected)))
                .andExpect(status()
                        .isOk());
    }

    @Test
    public void saveStoreShouldExistInDB() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Store expected = new Store("sdasd","asdada","sadad","sadad");

        String response= mockMvc.perform(post("/store")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(expected)))
                .andReturn().getResponse().getContentAsString();

        expected = new ObjectMapper().readValue(response, Store.class);
        Assert.assertEquals(expected, storeRepository.findById(expected.getId()).get());
    }
}
