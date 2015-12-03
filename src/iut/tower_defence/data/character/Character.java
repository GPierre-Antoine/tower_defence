package iut.tower_defence.data.character;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import iut.tower_defence.data.GameObject;

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
    }

    public void takeDamageFrom(Character other) {
        int damage = other.attack - defense;
        if (damage > 0) this.life =- damage;
    }

    public void move(GameContainer gc, float delta) {
        Input input = gc.getInput();
        int speed = this.speed;
        float distance = speed * (delta / 1000);

        if (input.isKeyDown(Input.KEY_LEFT)) {
            this.setX(this.getX() - distance);
        }
        if (input.isKeyDown(Input.KEY_RIGHT)) {
            this.setX(this.getX() + distance);
        }
        if (input.isKeyDown(Input.KEY_UP)) {
            this.setY(this.getY() - distance);
        }
        if (input.isKeyDown(Input.KEY_DOWN)) {
            this.setY(this.getY() + distance);
        }
    }


    public void applyUpgrade() {

    }
}
