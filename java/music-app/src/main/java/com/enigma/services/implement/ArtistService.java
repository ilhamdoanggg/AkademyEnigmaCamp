package com.enigma.services.implement;
import com.enigma.entity.Artist;
import com.enigma.repository.ArtistRepository;
import com.enigma.services.interfaces.ArtistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService implements ArtistServices {
    @Autowired
    ArtistRepository artistRepository;

    @Override
    public Artist saveArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public List<Artist> getAllArtist(Artist artist) {
        return artistRepository.findAll();
    }

    @Override
    public Artist getArtistById(String id) {
        if (!artistRepository.findById(id).isPresent()){
            return new Artist();
        }
       return artistRepository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        artistRepository.deleteById(id);
    }
}
