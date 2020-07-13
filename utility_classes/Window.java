package utility_classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Timer;
import javax.swing.JPanel;


public class Window extends JPanel {

    private static final long serialVersionUID = 1L;  // just to hide the annoying warning

    private Timer mainLoopTimer;
    private int renderDelay = 20;

    public Window() {

        this.mainLoopTimer = new Timer(this.renderDelay, new GetAction(this));
        this.mainLoopTimer.start();

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addMouseListener(new GetMousePress(this));
        addMouseWheelListener(new GetMouseScroll(this));
    }

    /* Main loop handles all events */
    public void mainLoop() {

    }

    /* Renders game on screen */
    public void paint(Graphics g) {

        /* Draw example */
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 500);

        g.dispose();
    }
} 
