package iut.tower_defence.directives;

import com.sun.glass.events.KeyEvent;
import com.sun.org.apache.xerces.internal.impl.xs.identity.KeyRef;
import iut.tower_defence.data.character.Player;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

import java.util.HashMap;

/**
 * Created by pierre-antoine on 04/12/15.
 */
public class DirectiveHandler {

    //Singleton

    private static DirectiveHandler instance = null;

    public static synchronized DirectiveHandler getInstance () {
        if (null == instance)
            instance = new DirectiveHandler();
        return instance;
    }

    private DirectiveHandler() {
        keyBinding = new HashMap<Integer, Control>();
    }

    HashMap<Integer,Control> keyBinding;


    public void initialize(Player player){
        keyBinding.put(Input.KEY_RIGHT, new MoveRight(player));
        keyBinding.put(Input.KEY_LEFT, new MoveLeft(player));
        keyBinding.put(Input.KEY_Q, new HitLeft(player));
        keyBinding.put(Input.KEY_D, new HitRight(player));
    }

    public void treatInput (int keyEvent) {
        keyBinding.get(keyEvent).execute();
    }

    public static void StaticTreatInput(int keyEvent) {
        instance.treatInput(keyEvent);
    }


}
