package com.example.musicstoreservice.service;

import com.example.musicstoreservice.models.Genre;
import com.example.musicstoreservice.repository.genre.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MusicStoreService {
    @Autowired
    private GenreRepository genreRepository;


    public List<Genre> getGenres() {
        return genreRepository.all();
    }

    public Genre getGenreByName(String name) {
        return genreRepository.getByName(name);
    }

    public Genre getGenreById(Long id) {
        return genreRepository.getById(id);
    }


}
