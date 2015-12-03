package iut.tower_defence.ressource.factory;

import iut.tower_defence.data.GameObject;
import iut.tower_defence.data.character.monster.MRange;

/**
 * Created by Kevin on 03/12/2015.
 */
public class MRangeFactory extends GameObjectFactory {

    protected GameObject buildGameObject () {
        return new MRange();
    } // buildGameObject
}
