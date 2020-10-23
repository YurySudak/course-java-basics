package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        printDamage(40, enemy);
    }

    public void attackEnemies(Enemy enemy1, Enemy enemy2) {
        System.out.println(Color.RED + getClass().getSimpleName() + " " + getName() + " attacks " + enemy1.getClass().getSimpleName() + " and " + enemy2.getClass().getSimpleName() + ".   " + Color.RESET);
        printDamage(20, enemy1);
        printDamage(20, enemy2);
    }
}
