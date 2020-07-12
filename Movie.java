package com.example.movie;

public class Movie {

    private String Title;
    private String mainActor;

    public Movie(String title, String mainActor, Double movieRate, Int pgRate, String genre) {
        Title = title;
        this.mainActor = mainActor;
        this.movieRate = movieRate;
        this.pgRate = pgRate;
        Genre = genre;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public Double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(Double movieRate) {
        this.movieRate = movieRate;
    }

    public Int getPgRate() {
        return pgRate;
    }

    public void setPgRate(Int pgRate) {
        this.pgRate = pgRate;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    private Double movieRate;
    private Int pgRate;
    private String Genre;

public void drive(Movie a){}

}
