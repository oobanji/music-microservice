package com.example.musicstoreservice.data;

import com.example.musicstoreservice.models.Album;
import com.example.musicstoreservice.models.Genre;
import com.example.musicstoreservice.repository.album.AlbumRepository;
import com.example.musicstoreservice.repository.genre.GenreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShoppingData {
    private static final Logger log = LoggerFactory.getLogger(ShoppingData.class);

    @Bean
    CommandLineRunner initDatabase(GenreRepository genreRepository, AlbumRepository albumRepository) {
        Genre genre = new Genre();
        Album album = new Album();

        genre.setName("Classical");
        album.setGenreId(2345L);
        album.setTitle("Indigo");
        album.setPrice(345.5f);

        genreRepository.add(genre);
        albumRepository.add(album);
        return args -> {
            log.info("Preloading");
        };
    }
}
