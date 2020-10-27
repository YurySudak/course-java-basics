package com.rakovets.course.javabasics.practice.jcf.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ClassTest {

    @Test
    void classTest() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Yuliya", "Gankovich", 20, 9.2));
        students.add(new Student("Roman", "Goncharuk", 30, 7.9));
        students.add(new Student("Dmitrij", "Zmachinskij", 25, 9.2));
        students.add(new Student("Roman", "Mashkov", 21, 8.5));
        students.add(new Student("Anastasiya", "Mihal'kevich",19, 6.9));
        students.add(new Student("Yan", "Pashik", 24, 7.7));
        students.add(new Student("Yuliya", "Portnova", 23, 9.5));
        students.add(new Student("Dmitrij", "Sedun", 20, 3.5));
        students.add(new Student("Oleg", "Smargun", 21, 7.5));
        students.add(new Student("Yurij", "Sudak", 32, 9.9));
        students.add(new Student("Innokentij", "Tyunyakin", 25, 9.0));
        students.add(new Student("Polina", "Ushakova",19, 7.4));
        students.add(new Student("Anna", "Hramkova", 22, 8.3));
        students.add(new Student("Valerij", "Sharamet", 26, 6.0));
        students.add(new Student("Vladislava", "Shugalo", 21, 7.5));
        SchoolClass schoolClass = new SchoolClass(students);
        assertEquals("Sudak", schoolClass.getBestStudent().getSurname());
        students.sort(schoolClass.name);
        assertEquals("Anastasiya Anna Dmitrij Dmitrij Innokentij Oleg Polina Roman Roman Valerij Vladislava Yan Yuliya Yuliya Yurij", schoolClass.getNames());
        assertEquals("Mihal'kevich Hramkova Sedun Zmachinskij Tyunyakin Smargun Ushakova Goncharuk Mashkov Sharamet Shugalo Pashik Gankovich Portnova Sudak", schoolClass.getSurnames());
        students.sort(schoolClass.age);
        assertEquals("32 30 26 25 25 24 23 22 21 21 21 20 20 19 19", schoolClass.getAges());
        students.sort(schoolClass.mark);
        assertEquals("9.9 9.5 9.2 9.2 9.0 8.5 8.3 7.9 7.7 7.5 7.5 7.4 6.9 6.0 3.5", schoolClass.getMarks());

    }
}
