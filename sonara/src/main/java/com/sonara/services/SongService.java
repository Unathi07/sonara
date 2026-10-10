package com.sonara.services;

import com.sonara.models.Song;
import com.sonara.models.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Handles operations related to songs
 */

@Service
public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongs(){
        return songRepository.findAll();
    }

    public Optional<Song> getSongById(Long Id) {
        return songRepository.findById(Id);
    }

    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }
}
