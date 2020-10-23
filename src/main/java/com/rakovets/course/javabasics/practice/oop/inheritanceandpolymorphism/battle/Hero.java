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
        if (health < 0) health = 0;
        if (health > 100) health = 100;
    }

    public void printDamage(int damage, Enemy enemy) {
        if (isAlive()) {
            System.out.print(Color.BLUE + getClass().getSimpleName() + " " + getName() + " attacks " + enemy.getClass().getSimpleName() + " and takes damage " + damage + ".   " + Color.RESET);
            enemy.takeDamage(damage);
            if (enemy.isAlive())
                System.out.println(Color.CYAN + enemy.getClass().getSimpleName() + " health = " + enemy.getHealth() + Color.RESET);
            else System.out.println(enemy.getClass().getSimpleName() + " is dead");
        }
    }

    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }
}
