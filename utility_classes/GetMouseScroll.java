package utility_classes;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


/* Detects scrool wheel events int the window */
public class GetMouseScroll implements MouseWheelListener {

    private Window window;

    public GetMouseScroll(Window window) {
        this.window = window;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
       
    }
    
}
 
