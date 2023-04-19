package window;

import javax.swing.*;
import java.awt.*;

public class Frame {
    // window size
    final public int WIDTH = 800;
    final public int HEIGHT = 600;

    // custom colors
    final public Color RED = new Color(0xD00000);
    final public Color GREEN = new Color(0x37FF8B);
    final public Color BLUE = new Color(0x00A6FB);
    final public Color WHITE = new Color(0xFAF9F9);
    final public Color BLACK = new Color(0x131200);

    public JFrame myFrame;


    // default constructor
    public Frame(){
        myFrame = new JFrame();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // object used to center game window

        // setting up window parameters
        myFrame.getContentPane().setBackground(BLUE);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setLayout(new BorderLayout());
        myFrame.setSize(WIDTH, HEIGHT);
        myFrame.setLocation(dim.width/2 - WIDTH/2, dim.height/2 - HEIGHT/2);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
        myFrame.setTitle("Mastermind");
        myFrame.setIconImage(new ImageIcon("./img/icon.png").getImage());
    }

}
