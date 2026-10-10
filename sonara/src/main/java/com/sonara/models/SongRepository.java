package com.sonara.models;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Provides database operations for the Song entity.
 */
public interface SongRepository extends JpaRepository<Song, Long> {
}
