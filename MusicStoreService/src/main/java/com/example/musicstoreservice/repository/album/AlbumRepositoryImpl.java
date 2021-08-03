package com.example.musicstoreservice.repository.album;

import com.example.musicstoreservice.models.Album;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Primary
@Repository
public class AlbumRepositoryImpl implements AlbumRepository {
    @Autowired
    @Lazy
    private AlbumJPARepository albumRepository;

    @Override
    public List<Album> list() {
        return albumRepository.findAll();
    }

    @Override
    public Album getByTitle(String name) {
        //return this.albumRepository.findByName(name);
        return null;
    }

    @Override
    public Album get(Long id) {
        return albumRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public List<Album> topSelling(int count) {
        return albumRepository.findAll().
                stream().sorted(Comparator.comparingInt(Album::getOrderCount)).
                collect(Collectors.toList()).subList(0, count);
    }

    @Override
    public void add(Album album) {
        albumRepository.saveAndFlush(album);
    }

    @Override
    public Album update(Album album) {
        Album exitingAlbum = albumRepository.findById(album.getAlbumId()).orElseThrow();
        BeanUtils.copyProperties(album, exitingAlbum);

        return albumRepository.saveAndFlush(exitingAlbum);
    }

    @Override
    public Album delete(Long id) {
        Album existingAlbum = albumRepository.findById(id).orElseThrow();
        albumRepository.delete(existingAlbum);
        return existingAlbum;
    }
}
