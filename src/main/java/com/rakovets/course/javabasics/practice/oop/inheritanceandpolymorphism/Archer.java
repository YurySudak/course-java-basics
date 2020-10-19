package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print(super.getName() + " attacks " + enemy.getType() + "   ");
        enemy.takeDamage(10);
        System.out.println(enemy.getType() + " health = " + enemy.getHealth());
    }

    public void attackEnemies(Enemy enemy1, Enemy enemy2) {
        System.out.print(getName() + " attacks " + enemy1.getType() + " and " + enemy2.getType() + "   ");
        enemy1.takeDamage(5);
        enemy2.takeDamage(5);
        System.out.print(enemy1.getType() + " health = " + enemy1.getHealth() + "   ");
        System.out.println(enemy2.getType() + " health = " + enemy2.getHealth());
    }
}
