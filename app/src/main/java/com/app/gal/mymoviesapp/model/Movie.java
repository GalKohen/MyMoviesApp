package com.app.gal.mymoviesapp.model;

/**
 * Created by Gal Kohen on 26/11/2018.
 */
public class Movie {
    String name;
    String content;
    String trailerLink;
    String releaseDate;
    String movieImageLink;

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, String movieImageLink) {
        this.name = name;
        this.movieImageLink = movieImageLink;
    }

    public Movie(String name, String content, String trailerLink, String releaseDate, String movieImageLink) {
        this.name = name;
        this.content = content;
        this.trailerLink = trailerLink;
        this.releaseDate = releaseDate;
        this.movieImageLink = movieImageLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMovieImageLink() {
        return movieImageLink;
    }

    public void setMovieImageLink(String movieImageLink) {
        this.movieImageLink = movieImageLink;
    }


}
