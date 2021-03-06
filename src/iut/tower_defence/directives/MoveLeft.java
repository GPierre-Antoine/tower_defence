package iut.tower_defence.directives;

import iut.tower_defence.data.character.Player;

/**
 * Created by pierre-antoine on 04/12/15.
 */
public class MoveLeft extends Control {

    public MoveLeft(Player player) {
        super(player);
    }

    @Override
    public void execute() {
        target.move(-1);
    }
}
