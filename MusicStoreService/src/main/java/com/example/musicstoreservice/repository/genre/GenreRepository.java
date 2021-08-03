package com.example.musicstoreservice.repository.genre;

import com.example.musicstoreservice.models.Genre;

import java.util.List;

public interface GenreRepository {
    List<Genre> list();

    Genre getByName(String name);

    Genre getById(Long id);
    void add(Genre genre);
}
