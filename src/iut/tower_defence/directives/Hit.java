package iut.tower_defence.directives;

import iut.tower_defence.data.character.Player;

/**
 * Created by julien on 04/12/2015.
 */
public class Hit extends Control{

    public Hit(Player player) {
        super(player);
    }

    public void execute() {
        target.attack();
    }
}
