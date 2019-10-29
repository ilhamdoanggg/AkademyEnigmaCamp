package com.enigma.repository;

import com.enigma.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * The interface Song repository.
 */
@Repository
public interface SongRepository extends JpaRepository<Song, String >, JpaSpecificationExecutor {

}
