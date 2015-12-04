package iut.tower_defence.directives;

import com.sun.glass.events.KeyEvent;
import com.sun.org.apache.xerces.internal.impl.xs.identity.KeyRef;
import iut.tower_defence.data.character.Player;
import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

import java.util.HashMap;

/**
 * Created by pierre-antoine on 04/12/15.
 */
public class DirectiveHandler {
    HashMap<Integer,Control> keyBinding;


    public void initialize(Player player){
        keyBinding.put(Keyboard.KEY_RIGHT, new MoveRight(player));
        keyBinding.put(Keyboard.KEY_LEFT, new MoveLeft(player));
        keyBinding.put(Keyboard.KEY_Q, new HitLeft(player));
        keyBinding.put(Keyboard.KEY_D, new HitRight(player));
    }

    public void update(Player player){
        keyBinding.clear();

        int moveRight = Keyboard.getEventKey();
        keyBinding.put(moveRight, new MoveRight(player));

        int moveLeft = Keyboard.getEventKey();
        keyBinding.put(moveLeft, new MoveLeft(player));

        int hitLeft = Keyboard.getEventKey();
        keyBinding.put(hitLeft, new HitLeft(player));

        int hitRight = Keyboard.getEventKey();
        keyBinding.put(hitRight, new HitRight(player));
    }

    public void TreatInput (int keyEvent) {
        keyBinding.get(keyEvent).execute();
    }


}
