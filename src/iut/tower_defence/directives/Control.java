package iut.tower_defence.directives;

import iut.tower_defence.data.character.Player;

/**
 * Created by pierre-antoine on 04/12/15.
 */
public abstract class Control {
    protected Player target;
    public abstract void execute();

    public Control (Player player) {
        this.target = player;
    }
}