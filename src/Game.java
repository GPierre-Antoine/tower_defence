import iut.tower_defence.data.GameObject;
import iut.tower_defence.ressource.RSManager;
import iut.tower_defence.ressource.factory.GameObjectFactory;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Alexandre on 03/12/2015.
 */
public class Game extends BasicGameState
{
    public static int ID;
    private static String URL_GAME = "iut/tower_defence/image/game.jpg";
    private Image gameImage;

    public Game(int ID) {
        Game.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        gameImage = new Image(URL_GAME);
    }

    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        int pos = (gameImage.getWidth() / 2 - WindowGame.GAME / 2);
        //gameImage.draw((WindowGame.WIDTH / 2) - (gameImage.getWidth() / 2), 0, 800, WindowGame.HEIGHT);
        gameImage.drawEmbedded(0, 0, gameImage.getWidth(), WindowGame.HEIGHT, 0, 0, WindowGame.WIDTH, WindowGame.HEIGHT);
        //splashscreen.draw(0, 0, WindowGame.WIDTH, WindowGame.HEIGHT);
    }
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        RSManager.getInstance().update();
    }
}