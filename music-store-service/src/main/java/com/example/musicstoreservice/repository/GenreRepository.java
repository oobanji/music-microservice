package com.example.musicstoreservice.repository;

import com.example.musicstoreservice.models.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
