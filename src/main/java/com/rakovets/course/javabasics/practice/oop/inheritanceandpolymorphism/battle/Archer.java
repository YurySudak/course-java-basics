package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print(super.getName() + " attacks " + enemy.getType() + "   ");
        enemy.takeDamage(40);
        if (enemy.isAlive())
            System.out.println(enemy.getType() + " health = " + enemy.getHealth());
        else System.out.println(enemy.getType() + " is dead");
    }

    public void attackEnemies(Enemy enemy1, Enemy enemy2) {
        System.out.print(getName() + " attacks " + enemy1.getType() + " and " + enemy2.getType() + "   ");
        enemy1.takeDamage(20);
        enemy2.takeDamage(20);
        if (enemy1.isAlive())
            System.out.print(enemy1.getType() + " health = " + enemy1.getHealth() + "   ");
        else System.out.print(enemy1.getType() + " is dead" + "   ");
        if (enemy2.isAlive())
            System.out.println(enemy2.getType() + " health = " + enemy2.getHealth());
        else System.out.println(enemy2.getType() + " is dead");
    }
}
