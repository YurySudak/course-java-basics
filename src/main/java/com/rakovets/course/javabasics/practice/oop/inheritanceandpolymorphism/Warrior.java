package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print(super.getName() + " attacks " + enemy.getType() + "   ");
        enemy.takeDamage(20);
        System.out.println(enemy.getType() + " health = " + enemy.getHealth());
    }

}
