package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Mag extends Hero {

    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print(super.getName() + " attacks " + enemy.getType() + "   ");
        enemy.takeDamage(20);
        if (enemy.isAlive())
            System.out.println(enemy.getType() + " health = " + enemy.getHealth());
        else System.out.println(enemy.getType() + " is dead");
    }

    public void cure(Hero hero) {
        System.out.print("Mag cures " + hero.getName() + "   ");
        hero.takeDamage(-20);
        System.out.println(hero.getName() + " health = " + hero.getHealth());
    }
}
