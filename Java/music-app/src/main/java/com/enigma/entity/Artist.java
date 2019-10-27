package com.enigma.entity;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * The type Artist.
 */
@Entity
public class Artist {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String  id;
    private String name;
    private String birdPlace;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date debut;
    @OneToMany(mappedBy = "idArtist", cascade = CascadeType.PERSIST)
    private List<Song> song = new ArrayList<>();

    /**
     * Instantiates a new Artist.
     */
    public Artist() {
    }

    /**
     * Instantiates a new Artist.
     *
     * @param id        the id
     * @param name      the name
     * @param birdPlace the bird place
     * @param debut     the debut
     */
    public Artist(String name, String birdPlace, Date debut) {
        this.name = name;
        this.birdPlace = birdPlace;
        this.debut = debut;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets bird place.
     *
     * @return the bird place
     */
    public String getBirdPlace() {
        return birdPlace;
    }

    /**
     * Sets bird place.
     *
     * @param birdPlace the bird place
     */
    public void setBirdPlace(String birdPlace) {
        this.birdPlace = birdPlace;
    }

    /**
     * Gets debut.
     *
     * @return the debut
     */
    public Date getDebut() {
        return debut;
    }

    /**
     * Sets debut.
     *
     * @param debut the debut
     */
    public void setDebut(Date debut) {
        this.debut = debut;
    }

    /**
     * Gets song.
     *
     * @return the song
     */
    public List<Song> getSong() {
        return song;
    }

    /**
     * Sets song.
     *
     * @param song the song
     */
    public void setSong(List<Song> song) {
        this.song = song;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(id, artist.id) &&
                Objects.equals(name, artist.name) &&
                Objects.equals(birdPlace, artist.birdPlace) &&
                Objects.equals(debut, artist.debut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birdPlace, debut);
    }
}
