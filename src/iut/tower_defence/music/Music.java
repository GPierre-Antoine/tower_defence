package iut.tower_defence.music;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by pierre-antoine on 03/12/15.
 */
public class Music {
    //Singleton

    private static Music instance = new Music();

    private String name = "music.wav"; // /!\ wav format /!\
    private File file = null;
    private Clip clip = null;
    private AudioInputStream inputStream = null;
    private long position;

    private Music() {
        //LOAD MUSIC FILE
        try {
            file = new File(name);
            clip = AudioSystem.getClip();
            inputStream = AudioSystem.getAudioInputStream(file);
            clip.open(inputStream);
        } catch (UnsupportedAudioFileException e) {
            e.getStackTrace();
        } catch (LineUnavailableException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    } // constructor

    public static Music getInstance() {
        if (instance == null)
            instance = new Music();
        return instance;
    } // getInstance

    public void start() {
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    } // start

    public void pause() {
        clip.stop();
        position = clip.getMicrosecondPosition();
    } // pause

    public void resume() {
        clip.setMicrosecondPosition(position);
        clip.start();
    } // resume

}
