import iut.tower_defence.data.GameObject;
import iut.tower_defence.data.character.Player;
import iut.tower_defence.data.character.monster.MMelee;
import iut.tower_defence.data.character.monster.MRange;
import iut.tower_defence.directives.Control;
import iut.tower_defence.ressource.RSManager;
import iut.tower_defence.ressource.factory.GameObjectFactory;
import iut.tower_defence.ressource.factory.MMeleeFactory;
import iut.tower_defence.ressource.factory.PlayerFactory;
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
    private GameObject gameObject;

    public Game(int ID) {
        Game.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        gameImage = new Image(URL_GAME);
        //gameObject = new GameObject();
    }

    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        int pos = (gameImage.getWidth() / 2 - WindowGame.GAME / 2);
        //gameImage.draw((WindowGame.WIDTH / 2) - (gameImage.getWidth() / 2), 0, 800, WindowGame.HEIGHT);
        //gameImage.setCenterOfRotation(gameImage.getWidth() / 2, gameImage.getHeight() / 2);
        gameImage.drawEmbedded(-gameImage.getWidth() / 2, 0, gameImage.getWidth() / 2, WindowGame.HEIGHT, -WindowGame.WIDTH / 2, 0, WindowGame.WIDTH / 2, WindowGame.HEIGHT);
        //gameImage.draw(WindowGame.WIDTH / 2 - gameImage.getWidth() / 2, 0, 3);
        //splashscreen.draw(0, 0, WindowGame.WIDTH, WindowGame.HEIGHT);
    }
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
        RSManager.getInstance().update();
        RSManager.getInstance().render();
    }
}