package ru.netology.movies;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MoviesManagerTest {
    MoviesManager manager = new MoviesManager();


    @Test
    public void addingMovie () {

        manager.add("1");
        manager.add("2");
        manager.add("3");
        String[] expected = {"1","2","3"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldGetAllFromManager() {
        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");
        manager.add("11");
        manager.add("12");

        String[] expected = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected,actual);
    }

}
