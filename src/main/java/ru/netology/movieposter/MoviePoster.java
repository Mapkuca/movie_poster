package ru.netology.movieposter;

public class MoviePoster {
    private String[] movies = new String[0];
    private int maxMovies;

    public MoviePoster() {
        maxMovies = 10;
    }

    public MoviePoster(int maxMovies) {
        this.maxMovies = maxMovies;
    }

    public void addNewMovie(String movie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int amount;
        if (movies.length < maxMovies) {
            amount = movies.length;
        } else {
            amount = maxMovies;
        }
        String[] tmp = new String[amount];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
