package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Enemy implements Mortal{

    protected int health = 100;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void attackHero(Hero hero) {
        System.out.print(getType() + " attacks " + hero.getName() + "   ");
        hero.takeDamage(10);
        System.out.println(hero.getName() + " health = " + hero.getHealth());
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public String getType() {
        return "Enemy";
    }
}
