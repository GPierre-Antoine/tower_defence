import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenu  extends BasicGameState {
    public static int ID;

    public MainMenu(int ID) {
        MainMenu.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void init(GameContainer container, StateBasedGame game) throws SlickException {

    }
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {

    }
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {

    }
}