import iut.tower_defence.data.character.Player;
import iut.tower_defence.directives.DirectiveHandler;
import iut.tower_defence.ressource.RSManager;
import org.newdawn.slick.*;
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
    private RSManager  rsm;
    private DirectiveHandler inputHandler;
    public Game(int ID) {
        Game.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        rsm = RSManager.getInstance();
        {
            Player player = new Player();
            rsm.add(player);
            inputHandler = DirectiveHandler.getInstance();
            inputHandler.initialize(player);
        }
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
        rsm.update();
        rsm.render();

    }
    @Override
    public void keyPressed(int key, char c) {
        DirectiveHandler.StaticTreatInput(key);
    }
}