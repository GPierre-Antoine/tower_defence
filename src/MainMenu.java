import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.awt.*;

/**
 * Created by Alexandre on 03/12/2015.
 */
public class MainMenu  extends BasicGameState {
    public static int ID;
    private static String URL_FONT = "iut/tower_defence/image/fontMainMenu.png";
    private static String URL_BUTTONS_PLAY = "iut/tower_defence/image/playButton.png";
    private static String URL_BUTTONS_SETTINGS = "iut/tower_defence/image/settingsButton.png";
    private static String URL_BUTTONS_CREDITS = "iut/tower_defence/image/creditsButton.png";
    private static String URL_BUTTONS_QUIT = "iut/tower_defence/image/quitButton.png";
    private MouseOverArea playButton;
    private Image playImage;
    private Image font;
    public MainMenu(int ID) {
        MainMenu.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        int heightButton = 100;

        playImage = new Image(URL_BUTTONS_PLAY);
        /*playImage = playImage.getScaledCopy(276, );

        font = new Image(URL_FONT);
        font = font.getScaledCopy(286, 217);
*/
        int left = Window.WIDTH / 2 - playImage.getWidth() / 2;
        int top = (int) (Window.HEIGHT + 2.5 + 2 * 5 + 2 +  playImage.getHeight() * 2);
        playButton = new MouseOverArea(container, playImage, left, top);
    }
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        font.draw(Window.WIDTH / 2 + 163, (Window.HEIGHT + 237) / 2);
        playImage.draw(Window.WIDTH / 2 + 173, (Window.HEIGHT + 237) / 2 + 5);
    }
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {

    }
}
