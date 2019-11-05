package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.services.interfaces.ArtistServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * The type Artist controller.
 */
@RestController
public class ArtistController {

    /**
     * The Artist services.
     */
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
     * Save artist with image get from id artist artist.
     *
     * @param multipartFile the multipart file
     * @param artist        the artist
     * @return the artist
     * @throws IOException the io exception
     */
    @CrossOrigin
    @PostMapping("/artist-images")
    public Artist saveArtistWithImageGetFromIdArtist(@RequestPart MultipartFile multipartFile,
                                                     @RequestPart String artist) throws IOException {
        return artistServices.saveArtistWithImage(multipartFile, artist);
    }

    /**
     * Get all artist by page page.
     *
     * @param size the size
     * @param page the page
     * @return the page
     */
    @CrossOrigin
    @GetMapping("/artists-page")
    public Page<Artist> getAllArtistByPage(@RequestParam Integer size, @RequestParam Integer page){
        Pageable pageable = PageRequest.of(page,size);
        return artistServices.getAllArtist(pageable);
    }

    @CrossOrigin
    @GetMapping("/artists")
    public List<Artist> getAllArtist(){
        return artistServices.getAllArtistWithOutPage();
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
