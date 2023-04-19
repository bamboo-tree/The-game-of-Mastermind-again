package window;

import javax.swing.*;
import java.awt.*;

public class Row {

    static ImageIcon[] colors = {
            new ImageIcon(new ImageIcon("./img/empty.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/blue.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/cyan.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/darkBlue.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/green.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/darkGreen.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/yellow.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/orange.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/red.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/violet.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/pink.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/white.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)),
            new ImageIcon(new ImageIcon("./img/black.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT))
    };

    static JPanel getRow(String n, int[] index){

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 10));

        JLabel number = new JLabel();
        number.setText(n);
        number.setHorizontalAlignment(JLabel.CENTER);
        number.setFont(new Font("Century Gothic", Font.BOLD, 16));
        number.setForeground(Color.BLACK);
        panel.add(number);

        for(int i : index){
            JLabel l = new JLabel();
            l.setOpaque(true);
            l.setVisible(true);
            l.setIcon(colors[i]);
            panel.add(l);
        }
        return panel;
    }

}
