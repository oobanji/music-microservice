package com.example.musicstoreservice.repository.genre;

import com.example.musicstoreservice.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GenreJPARepository extends JpaRepository<Genre, Long> {

    Genre findByName(@Param("name") String genreName);
}
