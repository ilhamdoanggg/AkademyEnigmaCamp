package com.enigma.services.implement;
import com.enigma.entity.Artist;
import com.enigma.entity.Song;
import com.enigma.repository.ArtistRepository;
import com.enigma.services.interfaces.ArtistServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FilenameUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ArtistService implements ArtistServices {
    @Autowired
    ArtistRepository artistRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public Artist saveArtist(Artist artist) {
        for (Song song: artist.getSong()) {
            song.setIdArtist(artist);
        }
        return artistRepository.save(artist);
    }

    @Override
    public Page<Artist> getAllArtist(Pageable pageable) {
        return artistRepository.findAll(pageable);
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

    @Override
    public List<Artist> getAllArtistWithOutPage() {
        return artistRepository.findAll();
    }

    /*
    * change permision if you using linux
    * in folder "/var/www/html/images/"
    * */
    @Override
    public Artist saveArtistWithImage(MultipartFile multipartFile, String artist) throws IOException {
        Artist artist1 = saveArtist(objectMapper.readValue(artist, Artist.class));
        try {
            byte[] bytes= multipartFile.getBytes();
            String ext= FilenameUtils.getExtension(multipartFile.getOriginalFilename());
            Path paths= Paths.get("/var/www/html/images/"+artist1.getId()+"."+ext);
            Files.write(paths, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return saveArtist(artist1);
    }
}
