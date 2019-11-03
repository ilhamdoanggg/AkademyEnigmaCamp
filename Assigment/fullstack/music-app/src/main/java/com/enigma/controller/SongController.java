package com.enigma.controller;

import com.enigma.entity.Song;
import com.enigma.services.interfaces.SongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Song controller.
 */
@RestController
public class SongController {
    @Autowired
    SongServices songServices;

    /**
     * Get data song by id song.
     *
     * @param id the id
     * @return the song
     */
    @CrossOrigin
    @GetMapping("/song/{id}")
    public Song getDataSongById(@PathVariable String id){
        return songServices.getSongById(id);
    }

    /**
     * Save song new song.
     *
     * @param song the song
     * @return the song
     */
    @CrossOrigin
    @PostMapping("/song")
    public Song saveSongNew(@RequestBody Song song){
        return songServices.saveSong(song);
    }


    /**
     * Get all song w ith page size page.
     *
     * @param size the size
     * @param page the page
     * @return the page
     */
    @CrossOrigin
    @GetMapping("/songs-page")
    public Page<Song> getAllSongWIthPageSize(@RequestParam Integer size, @RequestParam Integer page){
        Pageable pageable = PageRequest.of(page, size);
        return songServices.getAllSongByPage(pageable);
    }

    /**
     * Get all song with out page list.
     *
     * @return the list
     */
    @CrossOrigin
    @GetMapping("/songs")
    public List<Song> getAllSongWithOutPage(){
        return songServices.getAllSongWithOutPage();
    }
}
