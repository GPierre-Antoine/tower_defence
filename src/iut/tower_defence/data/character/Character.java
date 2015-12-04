package iut.tower_defence.data.character;

import org.lwjgl.util.vector.Vector2f;
import org.newdawn.slick.*;
import iut.tower_defence.data.GameObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Character extends GameObject {

    private int life;
    private int defense;
    private int attack;
    private int speedAttack;
    private int range;
    private boolean isDead;


    public Character(int life, int defense, int attack, int speedAttack, int range, boolean isDead) {
        this.life = life;
        this.defense = defense;
        this.attack = attack;
        this.speedAttack = speedAttack;
        this.range = range;
        this.isDead = isDead;
    } // Character

    public void takeDamageFrom(Character other) {
        int damage = other.attack - defense;
        if (damage > 0)
        {
            this.life =- damage;
            if (life <= 0)
            {
                isDead = true;
            }
        }
    } // takeDamageFrom

    public void move(int delta) {
        position.setX(position.getX() + delta);
    } // move

    public void attack(int delta){
        if (distance < range)
        {
            //TO DO
        }
    } // attack

    public void update() {

    } // update

    public void destroy() {

    } //destroy

    public List<GameObject> getCollidingEntities(int direction) {
        List<GameObject> goList = new ArrayList<>();
        return goList;
    } // getCollidingEntities

    public void applyUpgrade() {

    } // applyUpgrade
}
