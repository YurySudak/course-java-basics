package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print(super.getName() + " attacks " + enemy.getType() + "   ");
        enemy.takeDamage(50);
        if (enemy.isAlive())
            System.out.println(enemy.getType() + " health = " + enemy.getHealth());
        else System.out.println(enemy.getType() + " is dead");
    }

}
