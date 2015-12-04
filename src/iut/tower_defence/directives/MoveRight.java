package iut.tower_defence.directives;

import iut.tower_defence.data.character.Player;

/**
 * Created by pierre-antoine on 04/12/15.
 */
public class MoveRight extends Control {

    public MoveRight(Player player) {
        super(player);
    }

    @Override
    public void execute() {
        target.move(+1);
    }
}
