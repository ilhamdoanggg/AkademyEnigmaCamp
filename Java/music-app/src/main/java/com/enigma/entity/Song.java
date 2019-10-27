package com.enigma.entity;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * The type Song.
 */
@Entity
public class Song {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String  id;
    private String songName;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date release;
    @Transient
    private String idArtistTrancient;
    @ManyToOne
    private Artist idArtist;

    /**
     * Instantiates a new Song.
     */
    public Song() {
    }

    /**
     * Instantiates a new Song.
     *
     * @param songName the song name
     * @param release  the release
     */
    public Song(String songName, Date release, String idArtistTrancient) {
        this.songName = songName;
        this.release = release;
        this.idArtistTrancient = idArtistTrancient;
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
     * Gets song name.
     *
     * @return the song name
     */
    public String getSongName() {
        return songName;
    }

    /**
     * Sets song name.
     *
     * @param songName the song name
     */
    public void setSongName(String songName) {
        this.songName = songName;
    }

    /**
     * Gets release.
     *
     * @return the release
     */
    public Date getRelease() {
        return release;
    }

    /**
     * Sets release.
     *
     * @param release the release
     */
    public void setRelease(Date release) {
        this.release = release;
    }

    /**
     * Gets id artist.
     *
     * @return the id artist
     */
    public Artist getIdArtist() {
        return idArtist;
    }

    /**
     * Sets id artist.
     *
     * @param idArtist the id artist
     */
    public void setIdArtist(Artist idArtist) {
        this.idArtist = idArtist;
    }
    /**
     * Gets id artist trancient.
     *
     * @return the id artist trancient
     */
    public String getIdArtistTrancient() {
        return idArtistTrancient;
    }

    /**
     * Sets id artist trancient.
     *
     * @param idArtistTrancient the id artist trancient
     */
    public void setIdArtistTrancient(String idArtistTrancient) {
        this.idArtistTrancient = idArtistTrancient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) &&
                Objects.equals(songName, song.songName) &&
                Objects.equals(formatDate(release), formatDate(song.release));
    }

    private String formatDate(Date date){
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

}
