package iut.tower_defence.ressource.factory;

import iut.tower_defence.data.GameObject;
import iut.tower_defence.data.character.Player;

/**
 * Created by Kevin on 03/12/2015.
 */
public class PlayerFactory extends GameObjectFactory {

    protected GameObject buildGameObject () {
        return new Player();
    } // buildGameObject

}
