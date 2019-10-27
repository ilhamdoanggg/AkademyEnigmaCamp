package com.enigma.repository;

import com.enigma.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * The interface Artist repository.
 */
@Repository
public interface ArtistRepository extends JpaRepository<Artist, String >{
}
