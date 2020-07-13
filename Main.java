import utility_classes.Window;

import java.awt.Dimension;
import javax.swing.JFrame;


public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Title");

        int width=0, height=0;

        window.getContentPane().setPreferredSize(new Dimension(width, height));
        window.pack();
        window.setResizable(false);
            
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        window.add(new Window());
        window.setVisible(true);
    }
}
