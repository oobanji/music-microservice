package com.example.musicstoreservice.repository.album;

import com.example.musicstoreservice.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumJPARepository extends JpaRepository<Album, Long> {
    Album findByName(String name);
}
