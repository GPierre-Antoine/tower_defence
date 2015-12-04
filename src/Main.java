import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

class WindowGame extends StateBasedGame
{
    // Game state identifiers
    public static final int SPLASHSCREEN = 0;
    public static final int MAINMENU     = 1;
    public static final int GAME         = 2;

    // Application Properties
    public static final int FPS     = 60;

    // Class Constructor
    public WindowGame(String appName) {
        super(appName);
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
            app.setFullscreen(true);
            app.setTargetFrameRate(FPS);
            app.setShowFPS(true);
            app.start();
        } catch(SlickException e) {
            e.printStackTrace();
        }
    }
}