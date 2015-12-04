import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 * Created by Alexandre on 03/12/2015.
 */
class WindowGame extends StateBasedGame
{
    // GamestateIdentifiers
    public static final int SPLASHSCREEN = 0;
    public static final int MAINMENU     = 1;
    public static final int GAME         = 2;

    // Application Properties
    public static final int WIDTH   = 640;
    public static final int HEIGHT  = 480;
    public static final int FPS     = 60;
    public static WindowGame instance;

    public static WindowGame getInstance() {
        return instance;
    }

    // Class Constructor
    public WindowGame(String appName) {
        super(appName);
        instance = this;
    }

    public static void setState(int state) {
        WindowGame.getInstance().enterState(state);
    }

    // Initialize your game states (calls init method of each gamestate, and set's the state ID)
    public void initStatesList(GameContainer gc) throws SlickException {
        // The first state added will be the one that is loaded first, when the application is launched
        this.addState(new SplashScreen(SPLASHSCREEN));
        this.addState(new MainMenu(MAINMENU));
        this.addState(new Game(GAME));
    }

    // Main Method
    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new WindowGame("Tower Defense"));
            app.setDisplayMode(WIDTH, HEIGHT, false);
            app.setTargetFrameRate(FPS);
            app.setShowFPS(false);
            app.start();
        } catch(SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyPressed(int key, char c) {
        if(key == Input.KEY_SPACE )
            enterState(MAINMENU);
        else
            super.keyPressed(key, c);
    }
}