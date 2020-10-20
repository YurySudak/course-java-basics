package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public abstract class Hero implements Mortal{
    private String name;
    protected int health = 100;

    public Hero(String name) {
        this.name = name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }
}
