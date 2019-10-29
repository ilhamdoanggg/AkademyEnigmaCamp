package com.enigma.controller;

import com.enigma.entity.Song;
import com.enigma.services.interfaces.SongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {
    @Autowired
    SongServices songServices;

    @CrossOrigin
    @GetMapping("/song/{id}")
    public Song getDataSongById(@PathVariable String id){
        return songServices.getSongById(id);
    }
    @CrossOrigin
    @PostMapping("/song")
    public Song saveSongNew(@RequestBody Song song){
        return songServices.saveSong(song);
    }
    @CrossOrigin
    @GetMapping("/songs")
    public Page<Song> getAllSongWIthPageanSize(@RequestParam Integer size, @RequestParam Integer page){
        Pageable pageable = PageRequest.of(page, size);
        return songServices.getAllSongByPage(pageable);
    }
}
