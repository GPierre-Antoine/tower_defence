package iut.tower_defence.data.character;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Player extends Character {

    private String name;

    public Player(String name) {
        super(150, 5, 10, 1, 1, false);
        this.name = name;
    } // Player
}
