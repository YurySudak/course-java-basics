package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BattleTest {

    @Test
    void task1() {
        String name = "Arthur";
        Hero hero = new Hero(name) {
            @Override
            public void attackEnemy(Enemy enemy) {
            }
        };
        assertEquals(name, hero.getName());
    }

    @Test
    void task2() {
        Warrior warrior = new Warrior("Conon");
        assertTrue(warrior instanceof Hero);
        Mage mage = new Mage("Merlin");
        assertTrue(mage instanceof Hero);
        Archer archer = new Archer("Robin");
        assertTrue(archer instanceof Hero);
    }

    @Test
    void task3() {
        Enemy enemy = new Enemy(100);
        assertEquals(100, enemy.getHealth());
        enemy.takeDamage(20);
        assertEquals(80, enemy.getHealth());
        Warrior warrior = new Warrior("Conon");
        warrior.attackEnemy(enemy);
        assertEquals(30, enemy.getHealth());
        Mage mage = new Mage("Merlin");
        mage.attackEnemy(enemy);
        assertEquals(0, enemy.getHealth());
        Archer archer = new Archer("Robin");
        enemy.setHealth(100);
        archer.attackEnemy(enemy);
        assertEquals(60, enemy.getHealth());
    }

    @Test
    void task5() {
        Enemy enemy = new Enemy(100);
        assertTrue(enemy instanceof Mortal);
        assertTrue(enemy.isAlive());
        enemy.setHealth(0);
        assertFalse(enemy.isAlive());
    }

    @Test
    void task7() {
        Warrior warrior = new Warrior("Conon");
        Mage mage = new Mage("Merlin");
        Archer archer = new Archer("Robin");
        assertTrue(warrior instanceof Mortal);
        assertTrue(mage instanceof Mortal);
        assertTrue(archer instanceof Mortal);
        Zombie zombie = new Zombie(100);
        Witch witch = new Witch(100);
        Beast beast = new Beast(100);
        warrior.attackEnemy(zombie);
        assertEquals(50, zombie.getHealth());
        zombie.attackHero(warrior);
        assertEquals(80, warrior.getHealth());
        mage.attackEnemy(witch);
        assertEquals(70, witch.getHealth());
        witch.attackHero(mage);
        assertEquals(80, mage.getHealth());
        archer.attackEnemy(beast);
        assertEquals(68, beast.getHealth());
        beast.attackHero(archer);
        assertEquals(80, archer.getHealth());
        warrior.offendEnemy(zombie);
        warrior.attackEnemy(zombie);
        assertEquals(0, zombie.getHealth());
        witch.setResurrection(zombie);
        assertEquals(20, zombie.getHealth());
        archer.attackEnemies(zombie, witch);
        assertEquals(0, zombie.getHealth());
        assertEquals(50, witch.getHealth());
        beast.attackHero(warrior);
        assertEquals(60, warrior.getHealth());
        mage.cure(warrior);
        assertEquals(80, warrior.getHealth());
        beast.attackHero(mage);
        mage.attackEnemy(beast);
        beast.attackHero(mage);
        mage.attackEnemy(beast);
        beast.attackHero(mage);
        mage.attackEnemy(beast);
        assertEquals(0, beast.getHealth());
        assertEquals(20, mage.getHealth());
        beast.attackHero(mage);
        assertEquals(20, mage.getHealth());
    }
}
