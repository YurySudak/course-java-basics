package com.rakovets.course.javabasics.practice.exceptionhandling.exceptions;

public class NotEmailException extends RuntimeException{
    public NotEmailException(String message) {
        super(message);
    }
}
