package iut.tower_defence.ressource;

import iut.tower_defence.data.GameObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class RSManager {
    //Container
    //Singleton
    List<ArrayList<GameObject>> golist;

    private static RSManager instance = null;

    public static synchronized RSManager getInstance() {
        if (instance == null) instance = new RSManager();
        return instance;
    }

    private RSManager() {
    }

    public void generate() {

    }



    public void update() {

    }

    public void add (GameObject go) {

    }

}
