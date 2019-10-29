package com.enigma.services.implement;

import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repository.SongRepository;
import com.enigma.services.interfaces.ArtistServices;
import com.enigma.services.interfaces.SongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements SongServices {
    @Autowired
    SongRepository songRepository;
    @Autowired
    ArtistServices artistServices;
    @Override
    public Song saveSong(Song song) {
        Artist artist= artistServices.getArtistById(song.getIdArtistTrancient());
        song.setIdArtist(artist);
        return songRepository.save(song);
    }
    @Override
    public List<Song> getAllSong(Song song) {
        return songRepository.findAll();
    }

    @Override
    public Page<Song> getAllSongByPage(Pageable pageable) {
        return songRepository.findAll(pageable);
    }

    @Override
    public Song getSongById(String id) {
        if (!songRepository.findById(id).isPresent()){
            return new Song();
        }
        return songRepository.findById(id).get();
    }
    @Override
    public void deleteSongById(String id) {
        songRepository.deleteById(id);
    }
}
