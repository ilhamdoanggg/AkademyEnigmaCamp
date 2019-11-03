package com.enigma.services.interfaces;

import com.enigma.entity.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * The interface Song services.
 */
public interface SongServices {
    /**
     * Save song song.
     *
     * @param song the song
     * @return the song
     */
    Song saveSong(Song song);

    /**
     * Gets all song.
     *
     * @param song the song
     * @return the all song
     */
    List<Song> getAllSong(Song song);

    /**
     * Gets all song by page.
     *
     * @param pageable the pageable
     * @return the all song by page
     */
    Page<Song> getAllSongByPage(Pageable pageable);

    /**
     * Get all song with out page list.
     *
     * @return the list
     */
    List<Song>getAllSongWithOutPage();

    /**
     * Gets song by id.
     *
     * @param id the id
     * @return the song by id
     */
    Song getSongById(String id);

    /**
     * Delete song by id.
     *
     * @param id the id
     */
    void deleteSongById(String id);
}
