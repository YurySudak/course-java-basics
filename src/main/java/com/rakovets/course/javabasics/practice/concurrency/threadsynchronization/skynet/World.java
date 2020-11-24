package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import com.rakovets.course.javabasics.util.Color;

public class World extends Fraction {

    public World(Factory factory) {
        super(factory);
        fractionName = "World";
        has = Color.GREEN;
        made = Color.YELLOW;
    }
}
