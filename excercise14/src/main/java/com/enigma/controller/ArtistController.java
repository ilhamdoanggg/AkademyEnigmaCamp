package com.enigma.controller;

import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class ArtistController {
    @Autowired
    ArtistRepo artistRepo;

  @GetMapping("/artist")
  public String toArtist(Model model){
      List<Artist> artists = artistRepo.findAll();
      model.addAttribute("artistList", artists);
      return "/artist/artist-view";
  }

    @GetMapping("/add-artist")
    public ModelAndView toArtistViews(){
        return new ModelAndView(
                "/artist/artist-form",
                "artist", new Artist());
    }

    @GetMapping("/artist/")
    public String toArtistDetail(@PathVariable(required = true) Integer id, Model model){
        Optional<Artist> artist = artistRepo.findById(id);
        model.addAttribute("artistList", artist);
        return "redirect:/add-artist";
    }

    @PostMapping("/add-artist")
    public String toArtistForm(@ModelAttribute(
            "artist")Artist artist, Model model){
        artistRepo.save(artist);
        return "redirect:/artist";
    }
}
