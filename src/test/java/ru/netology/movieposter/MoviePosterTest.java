package ru.netology.movieposter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoviePosterTest {

    @Test
    public void shouldAddMovie() {
        MoviePoster moviePoster = new MoviePoster();

        moviePoster.addNewMovie("Колобок");
        moviePoster.addNewMovie("Колобок2");

        String[] expected = { "Колобок", "Колобок2"};
        String[] actual = moviePoster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAll() {
        MoviePoster moviePoster = new MoviePoster();

        moviePoster.addNewMovie("Колобок");
        moviePoster.addNewMovie("Колобок2");
        moviePoster.addNewMovie("Колобок3");
        moviePoster.addNewMovie("Колобок4");
        moviePoster.addNewMovie("Колобок5");
        moviePoster.addNewMovie("Колобок6");
        moviePoster.addNewMovie("Колобок7");
        moviePoster.addNewMovie("Колобок8");
        moviePoster.addNewMovie("Колобок9");
        moviePoster.addNewMovie("Колобок0");

        String[] expected = {"Колобок", "Колобок2", "Колобок3", "Колобок4", "Колобок5", "Колобок6", "Колобок7", "Колобок8", "Колобок9", "Колобок0"};
        String[] actual = moviePoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        MoviePoster moviePoster = new MoviePoster(5);

        moviePoster.addNewMovie("Колобок");
        moviePoster.addNewMovie("Колобок2");
        moviePoster.addNewMovie("Колобок3");
        moviePoster.addNewMovie("Колобок4");
        moviePoster.addNewMovie("Колобок5");

        String[] expected = {"Колобок5", "Колобок4", "Колобок3", "Колобок2", "Колобок"};
        String[] actual = moviePoster.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldFindAllWithLimit() {
        MoviePoster moviePoster = new MoviePoster(6);

        moviePoster.addNewMovie("Колобок");
        moviePoster.addNewMovie("Колобок2");
        moviePoster.addNewMovie("Колобок3");
        moviePoster.addNewMovie("Колобок4");
        moviePoster.addNewMovie("Колобок5");
        moviePoster.addNewMovie("Колобок6");

        String[] expected = {"Колобок", "Колобок2", "Колобок3", "Колобок4", "Колобок5", "Колобок6"};
        String[] actual = moviePoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

   @Test
    public void shouldFindAllWithLessLimit() {
        MoviePoster moviePoster = new MoviePoster(6);

        moviePoster.addNewMovie("Колобок");
        moviePoster.addNewMovie("Колобок2");
        moviePoster.addNewMovie("Колобок3");
        moviePoster.addNewMovie("Колобок4");
        moviePoster.addNewMovie("Колобок5");;

        String[] expected = {"Колобок", "Колобок2", "Колобок3", "Колобок4", "Колобок5"};
        String[] actual = moviePoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWhenLessLimit() {
        MoviePoster moviePoster = new MoviePoster();

        moviePoster.addNewMovie("Колобок");
        moviePoster.addNewMovie("Колобок2");
        moviePoster.addNewMovie("Колобок3");
        moviePoster.addNewMovie("Колобок4");
        moviePoster.addNewMovie("Колобок5");
        moviePoster.addNewMovie("Колобок6");

        String[] expected = {"Колобок6", "Колобок5", "Колобок4", "Колобок3", "Колобок2", "Колобок"};
        String[] actual = moviePoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
