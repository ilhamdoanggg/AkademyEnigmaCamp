package com.enigma.repository;

import com.enigma.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song, Integer> {
}
