package iut.tower_defence.image;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import java.io.IOException;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Texture {

    private org.newdawn.slick.opengl.Texture sprite = null;
    private Image image = null;

    public Texture (String path) {
        try {
            sprite = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(path));
            image = new Image(sprite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g, float x, float y) {
        g.drawImage(image,x,y);
    } // draw
}
