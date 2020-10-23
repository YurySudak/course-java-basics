package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        printDamage(50, enemy);
    }

    public void offendEnemy(Enemy enemy) {
        System.out.println(Color.RED + "Warrior " + getName() + " offends " + enemy.getClass().getSimpleName() + ". " + enemy.getClass().getSimpleName() + " cries." + Color.RESET);
    }

}
