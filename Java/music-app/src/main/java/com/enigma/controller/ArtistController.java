package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.services.interfaces.ArtistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Artist controller.
 */
@RestController
public class ArtistController {

    @Autowired
    ArtistServices artistServices;

//    @GetMapping("/artists")
//    public List<Artist> getAllArtistsData(Artist artist){
//        return artistServices.getAllArtist(artist);
//    }
    /**
     * Gets artist new.
     *
     * @param artist the artist
     * @return the artist new
     */
    @CrossOrigin
    @PostMapping("/artist")
    public Artist saveArtistNew(@RequestBody Artist artist){
        return artistServices.saveArtist(artist);
    }

    /**
     * Get all artist by page page.
     *
     * @param size the size
     * @param page the page
     * @return the page
     */
    @CrossOrigin
    @GetMapping("/artists")
    public Page<Artist> getAllArtistByPage(@RequestParam Integer size, @RequestParam Integer page){
        Pageable pageable = PageRequest.of(page,size);
        return artistServices.getAllArtist(pageable);
    }

    /**
     * Get artist by id rest controller artist.
     *
     * @param id the id
     * @return the artist
     */
    @CrossOrigin
    @GetMapping("/artist/{id}")
    public Artist getArtistByIdRestController(@PathVariable String id){
        return artistServices.getArtistById(id);
    }

    /**
     * Delete artist by id.
     *
     * @param id the id
     */
    @CrossOrigin
    @DeleteMapping("/artist/{id}")
    public void deleteArtistById(@PathVariable String id){
        artistServices.delete(id);
    }
}
