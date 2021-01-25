package com.rest_api.demo.Models;


import java.util.List;


public class Track {

    private String author;
    private List<List<String>> tracks;

    public Track(String author, List<List<String>> tracks) {
        this.author = author;
        this.tracks = tracks;
    }

    public Track() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<List<String>> getTracks() {
        return tracks;
    }

    public void setTracks(List<List<String>> tracks) {
        this.tracks = tracks;
    }
}
