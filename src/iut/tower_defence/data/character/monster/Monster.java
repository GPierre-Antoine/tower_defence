package iut.tower_defence.data.character.monster;

import iut.tower_defence.data.character.Character;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Monster extends Character {
    private int Life;
    private int Defense;
    private int Attack;
    private int Speed;
    private int SpeedAttack;
    private int Range;
    private boolean isDead;

    public Monster(int life, int defense, int attack, int speed, int speedAttack, int range, boolean isDead) {
        Life = life;
        Defense = defense;
        Attack = attack;
        Speed = speed;
        SpeedAttack = speedAttack;
        Range = range;
        this.isDead = isDead;
    }
}
