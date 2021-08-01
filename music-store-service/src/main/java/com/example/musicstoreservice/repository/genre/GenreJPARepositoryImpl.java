package com.example.musicstoreservice.repository.genre;


import com.example.musicstoreservice.models.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public class GenreJPARepositoryImpl implements GenreRepository {
    private GenreJPARepository genreRepository;

    @Override
    public List<Genre> list() {
        return genreRepository.findAll();
    }

    @Override
    public Genre getByName(String name) {
        return genreRepository.findByName(name);
    }

    @Override
    public Genre getById(Long id) {
        return genreRepository.findById(id)
                .orElseThrow();
    }
}
