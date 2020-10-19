package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class CatTest {
    public static void main(String[] args) {
        Person person = new Person(100);
        Cat cat = new Cat("Kot");
        Persian persian = new Persian("Persik");
        Sphynx sphynx = new Sphynx("Fin");
        Siamese siamese = new Siamese("Sim");
        System.out.println(person.getHappiness());
        cat.mew(person);
        System.out.println(person.getHappiness());
        persian.mew(person);
        System.out.println(person.getHappiness());
        sphynx.mew(person);
        System.out.println(person.getHappiness());
        siamese.mew(person);
        System.out.println(person.getHappiness());
        cat.purr(person);
        System.out.println(person.getHappiness());
        persian.purr(person);
        System.out.println(person.getHappiness());
        sphynx.purr(person);
        System.out.println(person.getHappiness());
        siamese.purr(person);
        System.out.println(person.getHappiness());
    }
}
