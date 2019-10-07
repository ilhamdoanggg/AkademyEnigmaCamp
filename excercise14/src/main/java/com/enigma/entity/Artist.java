package com.enigma.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Artist {
    @Id
    private Integer id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date debut;
    private String artistFrom;

    public Artist() {
    }

    public Artist(Integer id, String name, Date debut, String artistFrom) {
        this.id = id;
        this.name = name;
        this.debut = debut;
        this.artistFrom = artistFrom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public String getArtistFrom() {
        return artistFrom;
    }

    public void setArtistFrom(String artistFrom) {
        this.artistFrom = artistFrom;
    }
}
