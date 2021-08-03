package com.example.musicstoreservice.controller;

import com.example.musicstoreservice.models.Album;
import com.example.musicstoreservice.models.Genre;
import com.example.musicstoreservice.repository.album.AlbumRepository;
import com.example.musicstoreservice.repository.genre.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Store")
public class MusicStoreController {

    private GenreRepository genreRepository;
    private AlbumRepository albumRepository;

    @Autowired
    public MusicStoreController(GenreRepository genreRepository, AlbumRepository albumRepository) {
        this.genreRepository = genreRepository;
        this.albumRepository = albumRepository;
    }

    @RequestMapping(value = "Genres", method = RequestMethod.GET)
    public List<Genre> getGenres() {
        return genreRepository.list();
    }

    @RequestMapping(value = "Genre", method = RequestMethod.GET)
    public Genre getGenre(@RequestParam(required = false) Long id, @RequestParam String name) {
        Genre genre = null;

        if (!id.equals(0)) {
            genre = genreRepository.getById(id);
        } else {
            genre = genreRepository.getByName(name);
        }

        return genre;
    }

    @RequestMapping(value = "Albums", method = RequestMethod.GET)
    public List<Album> getAlbums(String genre) {
        return albumRepository.list();
    }

    @RequestMapping(value = "TopSelling", method = RequestMethod.GET)
    public List<Album> getTopSelling(@RequestParam(value = "count", defaultValue = "6") int count) {
        return albumRepository.topSelling(count);
    }
}
