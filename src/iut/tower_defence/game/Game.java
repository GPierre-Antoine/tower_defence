package iut.tower_defence.game;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Game {
    //Singleton

    private static Game instance = new Game();
    private int width;
    private int height;


    private Game() {

    }

    public static synchronized Game getInstance() {
        if (instance == null)
            instance = new Game();
        return instance;
    }

    public int getWidth() {return width;}
    public int getHeight() {return height;}
}
