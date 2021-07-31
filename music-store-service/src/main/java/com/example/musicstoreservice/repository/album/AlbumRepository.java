package com.example.musicstoreservice.repository.album;

import com.example.musicstoreservice.models.Album;
import com.example.musicstoreservice.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository {

    List<Album> all();

    Album getByName(String name);

    Album getById(Long id);

    List<Album> topSelling(int count);

    List<Artist> allArtists();

    void add(Album album);

    void update(Album album);

    void delete(Album album);
}