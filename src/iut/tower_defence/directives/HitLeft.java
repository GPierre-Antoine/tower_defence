package iut.tower_defence.directives;

import iut.tower_defence.data.character.Player;

/**
 * Created by julien on 04/12/2015.
 */
public class HitLeft extends Control{

    public HitLeft(Player player) {
        super(player);
    }

    public void execute() {
        target.attack(-1);
    }
}
