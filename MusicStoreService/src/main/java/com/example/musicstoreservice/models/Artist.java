package com.example.musicstoreservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
    @Id
    private Long artistId;
    private String artistName;

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
