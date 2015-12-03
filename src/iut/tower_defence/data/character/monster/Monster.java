package iut.tower_defence.data.character.monster;

import iut.tower_defence.data.character.Character;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Monster extends Character {

    public Monster(int life, int defense, int attack, int speed, int speedAttack, int range, boolean isDead) {
        super(life, defense, attack, speedAttack, range, isDead);
    }
}