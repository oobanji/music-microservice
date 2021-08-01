package com.example.musicstoreservice.service;

import com.example.musicstoreservice.models.Album;
import com.example.musicstoreservice.models.Genre;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MusicStoreService {

    List<Genre> getGenres();

    Genre getGenreByName(String name);

    Genre getGenreById(Long id);

    List<Album> getAlbums();

    Album getAlbum(String title);

    List<Album> topSelling(int count);

    void addAlbum(Album album);

    Album update(Album album);

    Album delete(Long id);
}
