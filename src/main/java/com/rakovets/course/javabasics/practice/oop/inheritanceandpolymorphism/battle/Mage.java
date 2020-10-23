package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        printDamage(30, enemy);
    }

    public void cure(Hero hero) {
        System.out.print(Color.RED + getClass().getSimpleName() +" " + getName() + " cures " + hero.getName() + ".   " + Color.RESET);
        hero.takeDamage(-20);
        System.out.println(Color.CYAN + hero.getName() + " health = " + hero.getHealth() + Color.RESET);
    }
}
