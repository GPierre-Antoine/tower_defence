package iut.tower_defence.data;

import iut.tower_defence.image.Texture;
import org.lwjgl.util.vector.Vector2f;
import org.newdawn.slick.Graphics;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public abstract class GameObject {

    protected Texture texture;
    protected Vector2f position;
    private static Graphics g = null;

    public abstract void update();

    public static void setGraphics (Graphics graphics) {
        g = graphics;
    } // setGraphics

    public void render() {
        g.drawImage(texture.getImage(),position.getX(),position.getY());
    } // render

}
