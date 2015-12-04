package iut.tower_defence.ressource;

import iut.tower_defence.data.GameObject;

import java.util.*;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class RSManager implements MemoryHandler {
    //Container
    //Singleton
    HashMap<Class,ArrayList<GameObject>> golist;

    private static RSManager instance = null;

    public static synchronized RSManager getInstance() {
        if (instance == null) instance = new RSManager();
        return instance;
    }

    private RSManager() {
    }



    public void update() {
        for (Class key : golist.keySet()) {
            int s = golist.get(key).size();
            for (int i = 0;i<s;++i) {
                golist.get(key).get(i).update();
            }
        }

    }

    public void render() {
        for (Class key : golist.keySet()) {
            int s = golist.get(key).size();
            for (int i = 0;i<s;++i) {
                golist.get(key).get(i).render();
            }
        }
    }

    public void add (GameObject go) {
        golist.get(go.getClass()).add(go);
    }

    public HashMap getGameObjects() {
        return golist;
    }

}
