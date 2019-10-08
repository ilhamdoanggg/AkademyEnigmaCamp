package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repository.ArtistRepo;
import com.enigma.repository.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SongController {

    /*
    * Include Artist Repo and
    * Song Repo
    * */
    @Autowired
    SongRepo songRepo;
    @Autowired
    ArtistRepo artistRepo;

    /*
    * Show all data song with param model
    * */
    @GetMapping("/song")
    public String toSong(Model model){
        List<Song> songs = songRepo.findAll();
        model.addAttribute("songlist", songs);
        return "/song/song-view";
    }

    /*
    * Add data Song with include atribute artist
    * artist data must be filled in
    * */
    @GetMapping("/add-song")
    public ModelAndView toSongView(Model model){
        List<Artist>artists = artistRepo.findAll();
        model.addAttribute("artis", artists);
        return new ModelAndView(
                "/song/song-form",
                "song",new Song());
    }

    /*
    * Edit data song in form view
    * */
    @GetMapping("/edit-song")
    public ModelAndView toEditSong(
            @RequestParam Integer id, Model model){
        Song song = songRepo.getOne(id);
        model.addAttribute("song", song);
        return new ModelAndView(
                "/song/song-form",
                "song", song);
    }

    /*
    * Save data song and redirect to Song view
    * */
    @PostMapping("/add-song")
    public String toSongForm(
            @ModelAttribute("song")
            Song song, Model model){
        songRepo.save(song);
        return "redirect:/song";
    }
}
