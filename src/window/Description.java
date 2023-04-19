package window;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Description {

    public JPanel container;
    private String text = "<html> <h2>MASTERMIND</h2> is a reto logical game, originally for two players.<br>One of them creates color pattern, and checks the submissions.<br>The other one trys to guess it in the least number of attempts.<br>After accepting color scheme player gets feedback:<br>BLACK - color is in the right spot<br>WHITE - color is in the pattern but somewhere else<br><br><h4>CONTROLS</h4>←→ move right - left to change the position<br> ↑ ↓ change color next - previous<br>ENTER - submit</html>";

    public Description(Frame frame){
        container = new JPanel();
        container.setLayout(new BorderLayout());
        container.setFocusable(true);


        // title section
        JLabel title = new JLabel();
        title.setPreferredSize(new Dimension(frame.WIDTH, 100));
        title.setText("b a s i c   r u l e s");
        title.setFont(new Font("Century Gothic", Font.BOLD, 36));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setOpaque(true);
        title.setBackground(frame.GREEN);
        title.setForeground(frame.BLACK);
        container.add(title, BorderLayout.NORTH);


        // game rules
        JLabel rules = new JLabel();
        rules.setPreferredSize(new Dimension(frame.WIDTH, 400));
        rules.setText(text);
        rules.setFont(new Font("Century Gothic", Font.BOLD, 16));
        rules.setHorizontalAlignment(JLabel.CENTER);
        rules.setOpaque(true);
        rules.setBackground(frame.WHITE);
        rules.setForeground(frame.BLACK);

        // how to leave
        JLabel leave = new JLabel();
        leave.setPreferredSize(new Dimension(frame.WIDTH, 50));
        leave.setText("Press any key to continue");
        leave.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        leave.setHorizontalAlignment(JLabel.CENTER);
        leave.setOpaque(true);
        leave.setBackground(frame.BLACK);
        leave.setForeground(frame.WHITE);

        // adding components to container
        container.add(title, BorderLayout.NORTH);
        container.add(rules, BorderLayout.CENTER);
        container.add(leave, BorderLayout.SOUTH);

        // adding components to frame
        frame.myFrame.add(container, BorderLayout.CENTER);
        frame.myFrame.setVisible(true);

        container.requestFocusInWindow();
    }


    public void killDescription(Frame frame){
        frame.myFrame.getContentPane().remove(container);
        frame.myFrame.invalidate();
        frame.myFrame.validate();
        frame.myFrame.setVisible(true);
    }
}
