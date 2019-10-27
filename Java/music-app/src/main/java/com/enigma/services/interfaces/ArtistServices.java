package com.enigma.services.interfaces;

import com.enigma.entity.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * The interface Artist services.
 */
public interface ArtistServices {
    /**
     * Save artist artist.
     *
     * @param artist the artist
     * @return the artist
     */
    Artist saveArtist(Artist artist);

    /**
     * Gets all artist.
     *
     * @param artist the artist
     * @return the all artist
     */
    Page<Artist> getAllArtist(Pageable pageable);

    /**
     * Gets artist by id.
     *
     * @param id the id
     * @return the artist by id
     */
    Artist getArtistById(String id);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(String id);
}
