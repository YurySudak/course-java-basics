package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CatTest {

    @Test
    void task1() {
        String name = "Vasia";
        Cat cat = new Cat(name);
        assertEquals(name, cat.getName());
        name = "Pirate";
        cat.setName(name);
        assertEquals(name, cat.getName());
    }

    @Test
    void task2() {
        Siamese siamese = new Siamese("Sim");
        assertTrue(siamese instanceof Cat);
        Persian persian = new Persian("Pers");
        assertTrue(persian instanceof Cat);
        Sphynx sphynx = new Sphynx("Fin");
        assertTrue(sphynx instanceof Cat);
        Person person = new Person(100);
        Cat cat = new Cat("Kot");
        assertFalse(siamese.mew(person).equals(persian.mew(person)));
        assertFalse(siamese.mew(person).equals(sphynx.mew(person)));
        assertFalse(persian.mew(person).equals(sphynx.mew(person)));
        assertFalse(cat.mew(person).equals(sphynx.mew(person)));
        assertFalse(cat.mew(person).equals(siamese.mew(person)));
        assertFalse(cat.mew(person).equals(persian.mew(person)));
        assertFalse(siamese.purr(person).equals(persian.purr(person)));
        assertFalse(siamese.purr(person).equals(sphynx.purr(person)));
        assertFalse(persian.purr(person).equals(sphynx.purr(person)));
        assertFalse(cat.purr(person).equals(sphynx.purr(person)));
        assertFalse(cat.purr(person).equals(siamese.purr(person)));
        assertFalse(cat.purr(person).equals(persian.purr(person)));
        System.out.println("Cat " + cat.getName());
        System.out.println(cat.mew(person));
        System.out.println(cat.purr(person));
        System.out.println("Persian " + persian.getName());
        System.out.println(persian.mew(person));
        System.out.println(persian.purr(person));
        System.out.println("Siamese " + siamese.getName());
        System.out.println(siamese.mew(person));
        System.out.println(siamese.purr(person));
        System.out.println("Sphinx " + sphynx.getName());
        System.out.println(sphynx.mew(person));
        System.out.println(sphynx.purr(person));
    }

    @Test
    void task3() {
        Person person = new Person(100);
        assertEquals(100, person.getHappiness());
        person.setHappiness(50);
        assertEquals(50, person.getHappiness());
        person.changeHappiness(30);
        assertEquals(80, person.getHappiness());
        person.changeHappiness(-10);
        assertEquals(70, person.getHappiness());
    }

    @Test
    void task4() {
        Person person = new Person(80);
        Cat cat = new Cat("Kitty");
        cat.mew(person);
        assertEquals(75, person.getHappiness());
        cat.purr(person);
        assertEquals(85, person.getHappiness());
    }

    @Test
    void task5() {
        Person person = new Person(80);
        Persian persian = new Persian("Pers");
        persian.mew(person);
        assertEquals(65, person.getHappiness());
        persian.purr(person);
        assertEquals(85, person.getHappiness());
        Siamese siamese = new Siamese("Sim");
        siamese.mew(person);
        assertEquals(75, person.getHappiness());
        siamese.purr(person);
        assertEquals(90, person.getHappiness());
        Sphynx sphynx = new Sphynx("King");
        sphynx.mew(person);
        assertEquals(70, person.getHappiness());
        sphynx.purr(person);
        assertEquals(95, person.getHappiness());

    }
}
