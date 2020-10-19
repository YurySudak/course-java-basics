package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Mag extends Hero {

    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print(super.getName() + " attacks " + enemy.getType() + "   ");
        enemy.takeDamage(15);
        System.out.println(enemy.getType() + " health = " + enemy.getHealth());
    }

    public void cure(Hero hero) {
        System.out.print("Mag cures " + hero.getName() + "   ");
        hero.takeDamage(-20);
        System.out.println(hero.getName() + " health = " + hero.getHealth());
    }
}
