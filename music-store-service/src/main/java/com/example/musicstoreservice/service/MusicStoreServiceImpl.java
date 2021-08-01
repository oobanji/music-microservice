package com.example.musicstoreservice.service;

import com.example.musicstoreservice.models.Album;
import com.example.musicstoreservice.models.Genre;
import com.example.musicstoreservice.repository.album.AlbumRepository;
import com.example.musicstoreservice.repository.genre.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicStoreServiceImpl implements MusicStoreService {
    private AlbumRepository albumRepository;

    private GenreRepository genreRepository;

    @Autowired
    public MusicStoreServiceImpl(AlbumRepository albumRepository, GenreRepository genreRepository) {
        this.albumRepository = albumRepository;
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> getGenres() {
        return genreRepository.list();
    }

    @Override
    public Genre getGenreByName(String name) {
        return genreRepository.getByName(name);
    }

    @Override
    public Genre getGenreById(Long id) {
        return genreRepository.getById(id);
    }

    @Override
    public List<Album> getAlbums() {
        return albumRepository.list();
    }

    @Override
    public Album getAlbum(String title) {
        return albumRepository.getByTitle(title);
    }

    @Override
    public List<Album> topSelling(int count) {
        return albumRepository.topSelling(count);
    }

    @Override
    public void addAlbum(Album album) {
        albumRepository.add(album);
    }

    @Override
    public Album update(Album album) {
        return albumRepository.update(album);
    }

    @Override
    public Album delete(Long id) {
        return albumRepository.delete(id);
    }
}
