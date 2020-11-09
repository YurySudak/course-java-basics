package com.rakovets.course.javabasics.practice.javaio;

import java.io.Serializable;

public class Touchpad implements Serializable {
    int high;
    int width;

    public Touchpad(int high, int width) {
        this.high = high;
        this.width = width;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
