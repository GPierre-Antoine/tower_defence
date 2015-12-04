package iut.tower_defence.data;

import iut.tower_defence.image.Texture;
import org.newdawn.slick.Graphics;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public abstract class GameObject {

    protected Texture texture;

    public abstract void update();
    public abstract void render(Graphics g);

}
