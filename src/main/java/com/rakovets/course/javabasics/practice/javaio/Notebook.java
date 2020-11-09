package com.rakovets.course.javabasics.practice.javaio;

public class Notebook extends Computer {
    private Touchpad touchpad;
    transient String display;

    public Notebook(String CPU, String HDD, String RAM) {
        super(CPU, HDD, RAM);
    }

    public Notebook(String CPU, String HDD, String RAM, Touchpad touchpad, String display) {
        super(CPU, HDD, RAM);
        this.touchpad = touchpad;
        this.display = display;
    }

    public Touchpad getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(Touchpad touchpad) {
        this.touchpad = touchpad;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
