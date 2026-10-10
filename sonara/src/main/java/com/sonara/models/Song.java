package com.sonara.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a song stored in Sonara.
 */
@Entity
public class Song {

    @Id
    // Let PostgreSQL generate unique IDs for new songs.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;
    private String genre;
    private Integer durationSeconds;

    public Song() {
    }

    public Song(String title, String artist, String genre, Integer durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.durationSeconds = durationSeconds;
    }

    public Long getId(){
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

}
