package com.rakovets.course.javabasics.practice.jcf.list;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudioTest {

    @Test
    void studioTest() {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Jim", "Carrey", 100, 58));
        actors.add(new Actor("Keanu", "Reeves", 250, 56));
        actors.add(new Actor("Robert", "Downey-Jr", 75, 55));
        actors.add(new Actor("Johnny", "Depp", 55, 57));
        actors.add(new Actor("Cameron", "Diaz", 42, 48));
        Studio studio = new Studio(actors);
        actors.sort(Studio.lastName);
        assertEquals("Carrey Depp Diaz Downey-Jr Reeves", studio.getLastNames());
        actors.sort(Studio.age);
        assertEquals("48 55 56 57 58", studio.getAges());
        actors.sort(Studio.fee);
        assertEquals("250 100 75 55 42", studio.getFees());
        studio.fire();
        assertEquals("100 75 55 42", studio.getFees());
        actors.add(new Actor("Guillermo", "Diaz", 55, 45));
        actors.sort(Studio.lastNameAndAge);
        assertEquals("Carrey Depp Diaz Diaz Downey-Jr", studio.getLastNames());
        assertEquals("58 57 45 48 55", studio.getAges());
        actors.sort(Studio.feeAndLastName);
        assertEquals("100 75 55 55 42", studio.getFees());
        assertEquals("Carrey Downey-Jr Depp Diaz Diaz", studio.getLastNames());
    }
}
