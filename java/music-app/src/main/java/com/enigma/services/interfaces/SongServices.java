package com.enigma.services.interfaces;

import com.enigma.entity.Song;

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
