package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.services.interfaces.ArtistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {
    @Autowired
    ArtistServices artistServices;

    @GetMapping("/artists")
    public List<Artist> getAllArtistsData(Artist artist){
        return artistServices.getAllArtist(artist);
    }
    @GetMapping("/artist/{id}")
    public Artist getArtistByIdRestController(@PathVariable String id){
        return artistServices.getArtistById(id);
    }


}
