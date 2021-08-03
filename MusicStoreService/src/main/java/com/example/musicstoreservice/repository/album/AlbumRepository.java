package com.example.musicstoreservice.repository.album;

import com.example.musicstoreservice.models.Album;

import java.util.List;

public interface AlbumRepository {

    List<Album> list();

    Album getByTitle(String name);

    Album get(Long id);

    List<Album> topSelling(int count);

    void add(Album album);

    Album update(Album album);

    Album delete(Long id);
}