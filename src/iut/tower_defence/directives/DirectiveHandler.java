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
        keyBinding.put(Keyboard.KEY_SPACE, new Hit(player));
    }




}
