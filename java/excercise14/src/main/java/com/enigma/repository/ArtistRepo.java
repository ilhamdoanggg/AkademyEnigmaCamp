package com.enigma.repository;

import com.enigma.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepo extends JpaRepository<Artist, Integer> {
}
