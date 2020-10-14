package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        int minutesLeft = totalSeconds % 3600;
        this.minutes = minutesLeft / 60;
        this.seconds = minutesLeft % 60;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public int getHours() {
        return this.hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return this.seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
