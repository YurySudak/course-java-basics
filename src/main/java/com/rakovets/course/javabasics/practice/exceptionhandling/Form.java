package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NotAdultException;
import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NotEmailException;

public class Form {
    protected String name;
    protected int age;
    protected String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) throws NotAdultException {
        if (age < 18) throw new NotAdultException(age + " is less then 18");
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws NotEmailException {
        if (!email.matches(".+@.+\\..+")) throw new NotEmailException("This is not a e-mail: " + email);
        this.email = email;
    }
}
