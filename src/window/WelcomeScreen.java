package window;

import javax.swing.*;
import java.awt.*;

public class WelcomeScreen{

    public JPanel container;
    public JTextField usernameInput;
    public JLabel userInfo;



    public WelcomeScreen(Frame frame){

        container = new JPanel();
        container.setLayout(new BorderLayout());

        // mastermind title
        JLabel title = new JLabel();
        title.setPreferredSize(new Dimension(frame.WIDTH, 300));
        title.setText("Mastermind");
        title.setFont(new Font("Century Gothic", Font.BOLD, 52));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setOpaque(true);
        title.setBackground(frame.BLUE);
        title.setForeground(frame.BLACK);
        container.add(title, BorderLayout.NORTH);

        // author info
        JLabel info = new JLabel();
        info.setPreferredSize(new Dimension(frame.WIDTH, 50));
        info.setText("Maciej Kamiński 2023 ©");
        info.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        info.setHorizontalAlignment(JLabel.CENTER);
        info.setOpaque(true);
        info.setBackground(frame.BLACK);
        info.setForeground(frame.WHITE);
        container.add(info, BorderLayout.SOUTH);

        // input section
        JPanel inputSection = new JPanel();
        inputSection.setOpaque(true);
        inputSection.setBackground(frame.WHITE);
        inputSection.setLayout(new GridLayout(3,1));

        // text label
        JLabel text = new JLabel();
        text.setText("◄ Enter username ►");
        text.setFont(new Font("Century Gothic", Font.BOLD, 32));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setOpaque(true);
        text.setBackground(frame.WHITE);
        text.setForeground(frame.BLACK);
        inputSection.add(text);

        // text field for username
        usernameInput = new JTextField();
        usernameInput.setToolTipText("username should be created from letters and/or numbers A-Z, a-z, 0-9 with no spaces");
        usernameInput.setFont(new Font("Century Gothic", Font.BOLD, 24));
        usernameInput.setHorizontalAlignment(SwingConstants.CENTER);
        usernameInput.setBackground(frame.WHITE);
        usernameInput.setForeground(frame.BLACK);
        usernameInput.setBorder(null);
        inputSection.add(usernameInput);

        // information to user about their username
        userInfo = new JLabel();
        userInfo.setText("remember to make it pretty :D");
        userInfo.setFont(new Font("Century Gothic", Font.BOLD, 14));
        userInfo.setHorizontalAlignment(JLabel.CENTER);
        userInfo.setOpaque(true);
        userInfo.setBackground(frame.WHITE);
        userInfo.setForeground(frame.BLACK);
        inputSection.add(userInfo);


        // adding components
        container.add(inputSection, BorderLayout.CENTER);
        frame.myFrame.add(container, BorderLayout.CENTER);
        frame.myFrame.setVisible(true);

        // setting default cursor position in the text field
        usernameInput.requestFocusInWindow();
    }

    public void killWelcomeScreen(Frame frame){
        frame.myFrame.getContentPane().remove(container);
        frame.myFrame.invalidate();
        frame.myFrame.validate();
        frame.myFrame.setVisible(true);
    }
}
