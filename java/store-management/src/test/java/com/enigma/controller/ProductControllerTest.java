package com.enigma.controller;

import com.enigma.entity.Product;
import com.enigma.repository.ProductRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    //@MockBean
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ProductRepository productRepository;
    //ObjectMapper mapper;

    @Test
    public void SaveProductShouldReturnOkStatus() throws Exception {
      ObjectMapper mapper = new ObjectMapper();
      Product product = new Product("Suriken",10, BigDecimal.valueOf(100));
      mockMvc.perform(post("/product")
              .contentType(MediaType.APPLICATION_JSON)
              .content(mapper.writeValueAsString(product)))
              .andExpect(status().isOk());
    }

    @Test
    public void SaveProductShouldReturnOkStatusFalse() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Product product = new Product("Suriken",10, BigDecimal.valueOf(100));
        mockMvc.perform(post("/product")
                .contentType(MediaType.APPLICATION_JSON)
                .content(mapper.writeValueAsString(product)))
                .andExpect(status().isOk());
                        //.isCreated());
                //.andExpect(jsonPath("$.name", is("foo"))).andExpect(jsonPath("$.foo"))
    }
}
