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

    private Image playImage;
    private Image settingsImage;
    private Image creditsImage;
    private Image quitImage;
    private Image font;

    private MouseOverArea playButton;
    private MouseOverArea settingsButton;
    private MouseOverArea creditsButton;
    private MouseOverArea quitButton;

    public MainMenu(int ID) {
        MainMenu.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        int heightButton = 100;
        font = new Image(URL_FONT);
        font = font.getScaledCopy(286, 217);
        playImage = new Image(URL_BUTTONS_PLAY);
        settingsImage = new Image(URL_BUTTONS_SETTINGS);
        creditsImage = new Image(URL_BUTTONS_CREDITS);
        quitImage = new Image(URL_BUTTONS_QUIT);

        playButton = new MouseOverArea(container, playImage, 290, 230) {
            @Override
            public void mouseClicked(int button, int x, int y, int clickCount) {
                WindowGame.setState(WindowGame.GAME);
            }
        };
        settingsButton = new MouseOverArea(container, settingsImage, 290, 330) {
            @Override
            public void mouseClicked(int button, int x, int y, int clickCount) {
                WindowGame.setState(WindowGame.GAME);
            }
        };
        creditsButton = new MouseOverArea(container, creditsImage, 290, 430) {
            @Override
            public void mouseClicked(int button, int x, int y, int clickCount) {
                WindowGame.setState(WindowGame.GAME);
            }
        };
        quitButton = new MouseOverArea(container, quitImage, 290, 530) {
            @Override
            public void mouseClicked(int button, int x, int y, int clickCount) {
                //System.exit(0);
            }
        };

        /*playImage = playImage.getScaledCopy(276, );



*/
        //int left = Window.WIDTH / 2 - playImage.getWidth() / 2;
        //int top = (int) (Window.HEIGHT + 2.5 + 2 * 5 + 2 +  playImage.getHeight() * 2);

    }
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        font.draw(Window.WIDTH / 2 + 163, (Window.HEIGHT + 237) / 2);
        playImage.draw(Window.WIDTH / 2 + 163 + 5, (Window.HEIGHT + 237) / 2 + 5);
        settingsImage.draw(Window.WIDTH / 2 + 163 + 5, (Window.HEIGHT + 237) / 2 + 5  * 2 + 48);
        creditsImage.draw(Window.WIDTH / 2 + 163 + 5, (Window.HEIGHT + 237) / 2 + 5 * 3 + 48 * 2);
        quitImage.draw(Window.WIDTH / 2 + 163 + 5, (Window.HEIGHT + 237) / 2 + 5 * 4 + 48 * 3);
     }
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {

    }
}
