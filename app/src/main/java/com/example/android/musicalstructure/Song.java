package com.example.android.musicalstructure;

/**
 * Created by promyk on 02.03.18.
 */

public class Song {
    private String artist;
    private String title;

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }

}
