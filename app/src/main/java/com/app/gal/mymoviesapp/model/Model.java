package com.app.gal.mymoviesapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gal Kohen on 26/11/2018.
 */
public class Model {
    private static final Model ourInstance = new Model();

    List<Movie> movies;
   public static Model getInstance() {
        return ourInstance;
    }

    private Model() {
        movies = new ArrayList<>();
        initMovies();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    private void initMovies() {
        movies.add(new Movie("Jurassic World","https://image.tmdb.org/t/p/w342/c9XxwwhPHdaImA2f1WEfEsbhaFB.jpg"));
        movies.add(new Movie("The Meg","https://image.tmdb.org/t/p/w342/eyWICPcxOuTcDDDbTMOZawoOn8d.jpg"));
        movies.add(new Movie("The First Purge","https://image.tmdb.org/t/p/w342/2slvblTroiT1lY9bYLK7Amigo1k.jpg"));
        movies.add(new Movie("Deadpool 2","https://image.tmdb.org/t/p/w342/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg"));
        movies.add(new Movie("Black Panther","https://image.tmdb.org/t/p/w342/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"));
        movies.add(new Movie("Ocean's Eight","https://image.tmdb.org/t/p/w342/MvYpKlpFukTivnlBhizGbkAe3v.jpg"));
        movies.add(new Movie("Interstellar","https://image.tmdb.org/t/p/w342/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg"));
        movies.add(new Movie("Thor - Ragnarok","https://image.tmdb.org/t/p/w342/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg"));
        movies.add(new Movie("Guardians of the Galaxy","https://image.tmdb.org/t/p/w342/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg"));


        movies.add(new Movie("Jurassic World2","https://image.tmdb.org/t/p/w342/c9XxwwhPHdaImA2f1WEfEsbhaFB.jpg"));
        movies.add(new Movie("The Meg2","https://image.tmdb.org/t/p/w342/eyWICPcxOuTcDDDbTMOZawoOn8d.jpg"));
        movies.add(new Movie("The First Purge2","https://image.tmdb.org/t/p/w342/2slvblTroiT1lY9bYLK7Amigo1k.jpg"));
        movies.add(new Movie("Deadpool 22","https://image.tmdb.org/t/p/w342/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg"));
        movies.add(new Movie("Black Panther2","https://image.tmdb.org/t/p/w342/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"));
        movies.add(new Movie("Ocean's Eight2","https://image.tmdb.org/t/p/w342/MvYpKlpFukTivnlBhizGbkAe3v.jpg"));
        movies.add(new Movie("Interstellar2","https://image.tmdb.org/t/p/w342/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg"));
        movies.add(new Movie("Thor - Ragnarok2","https://image.tmdb.org/t/p/w342/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg"));
        movies.add(new Movie("Guardians of the Galaxy2","https://image.tmdb.org/t/p/w342/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg"));
    }
}
