package com.enigma.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Song {
    @Id
    private Integer id;
    private String songName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date release;

    @ManyToOne
    private Artist idArtist;

    public Song() {
    }

    public Song(Integer id, String songName, Date release) {
        this.id = id;
        this.songName = songName;
        this.release = release;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public Artist getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Artist idArtist) {
        this.idArtist = idArtist;
    }
}
