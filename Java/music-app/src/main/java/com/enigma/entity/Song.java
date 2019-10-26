package com.enigma.entity;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date release;
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
     * @param id       the id
     * @param songName the song name
     * @param release  the release
     */
    public Song(String id, String songName, Date release) {
        this.id = id;
        this.songName = songName;
        this.release = release;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) &&
                Objects.equals(songName, song.songName) &&
                Objects.equals(release, song.release);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, songName, release, idArtist);
    }
}
