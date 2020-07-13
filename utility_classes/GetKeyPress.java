package utility_classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/* Detects key events int the window */
public class GetKeyPress implements KeyListener {

    private Window window;

    public GetKeyPress(Window window) {
        this.window = window;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }   
}