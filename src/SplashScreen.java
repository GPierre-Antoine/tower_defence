import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Alexandre on 03/12/2015.
 */
public class SplashScreen extends BasicGameState {
    public static int ID;
    private static String URL_SPLASHSCREEN = "iut/tower_defence/image/test.png";

    private Image splashscreen;

    public SplashScreen(int ID) {
        SplashScreen.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        splashscreen = new Image(URL_SPLASHSCREEN);
    }
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        splashscreen.draw(0, 0, WindowGame.WIDTH, WindowGame.HEIGHT);
    }
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {

    }
}
