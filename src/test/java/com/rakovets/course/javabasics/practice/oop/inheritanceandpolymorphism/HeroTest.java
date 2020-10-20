package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle.*;

public class HeroTest {
    public static void main(String[] args) {
        Mag mag = new Mag("Merlin");
        Warrior warrior = new Warrior("Conon");
        Archer archer = new Archer("Robin");
        Zombie zombie = new Zombie(100);
        Witch witch = new Witch(100);
        Skeleton skeleton = new Skeleton(100);
        mag.attackEnemy(zombie);
        zombie.attackHero(mag);
        warrior.attackEnemy(zombie);
        zombie.attackHero(warrior);
        witch.attackHero(warrior);
        mag.cure(warrior);
        archer.attackEnemies(zombie, witch);
        mag.attackEnemy(zombie);
        witch.setResurrection(zombie);
        warrior.attackEnemy(skeleton);
        archer.attackEnemies(zombie, skeleton);
        archer.attackEnemy(skeleton);
        archer.attackEnemies(skeleton, witch);
    }
}
