package com.example.musicstoreservice.controller;

import com.example.musicstoreservice.models.Genre;
import com.example.musicstoreservice.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicStoreController {

    private GenreRepository genreRepository;

    @Autowired
    public MusicStoreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @RequestMapping(value = "/Genres", method = RequestMethod.GET)
    public Iterable<Genre> GetGenres() {
        return this.genreRepository.findAll();
    }

    @RequestMapping(value = "/Genre", method = RequestMethod.GET)
    public Genre GetGenre(@RequestParam(required = false) Long id,
                          @RequestParam(value = "name", defaultValue = "") String name) {
        return new Genre();
    }
}
