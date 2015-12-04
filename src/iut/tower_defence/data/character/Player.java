package iut.tower_defence.data.character;

import iut.tower_defence.data.Inputable;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Player extends Character {

    private String name;
    private int score;

    public Player() {
        super(150, 5, 10, 1, 1, false);
        score = 0;
    } // Player

    public void updateScore (int i) { score += i; } // updateScore

    public void setName (String n) {
        name = n;
    } // setName

}
