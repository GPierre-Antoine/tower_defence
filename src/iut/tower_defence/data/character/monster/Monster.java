package iut.tower_defence.data.character.monster;

import iut.tower_defence.data.character.Character;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Monster extends Character {
    private int life;
    private int defense;
    private int attack;
    private int speed;
    private int speedAttack;
    private int range;
    private boolean isDead;

    public Monster(int life, int defense, int attack, int speed, int speedAttack, int range, boolean isDead) {
        this.life = life;
        this.defense = defense;
        this.attack = attack;
        this.speed = speed;
        this.speedAttack = speedAttack;
        this.range = range;
        this.isDead = isDead;
    }
}
