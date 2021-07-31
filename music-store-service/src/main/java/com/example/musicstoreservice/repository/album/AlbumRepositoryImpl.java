package com.example.musicstoreservice.repository.album;

import com.example.musicstoreservice.models.Album;
import com.example.musicstoreservice.models.Artist;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Comparator;
import java.util.List;

public class AlbumRepositoryImpl implements AlbumRepository {

    @Autowired
    AlbumJPARepository albumRepository;

    @Override
    public List<Album> all() {
        return albumRepository.findAll();
    }

    @Override
    public Album getByName(String name) {
        return this.albumRepository.findByName(name);
    }

    @Override
    public Album getById(Long id) {
        return albumRepository.findById(id)
                .orElseThrow();
    }


    @Override
    public List<Album> topSelling(int count) {
        return null;
    }

    @Override
    public List<Artist> allArtists() {
        return null;
    }

    @Override
    public void add(Album album) {

    }

    @Override
    public void update(Album album) {

    }

    @Override
    public void delete(Album album) {

    }
}
