package iut.tower_defence.ressource.factory;

import iut.tower_defence.data.GameObject;
import iut.tower_defence.ressource.MemoryHandler;

/**
 * Created by Kevin on 03/12/2015.
 */
public abstract class GameObjectFactory {

    private static MemoryHandler handler = null;

    protected abstract GameObject buildGameObject ();

    public void createGameObject () {
        GameObject go = buildGameObject();
        handler.add(go);
    } // createGameObject
}
