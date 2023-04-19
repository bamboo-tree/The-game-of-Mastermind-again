package window;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Board {

    public JPanel container;



    int[][] rows = new int[10][4];

    public void fillArray(){
        for(int i = 0; i < 10; i++){
            Arrays.fill(rows[i], 0);
        }
    }




    public Board(Frame frame, User user){

        container = new JPanel();
        container.setLayout(new BorderLayout());

        JPanel info = new JPanel();
        info.setOpaque(true);
        info.setBackground(frame.BLACK);
        info.setPreferredSize(new Dimension(200, frame.HEIGHT));
        info.setLayout(new GridLayout(6,1));

        // username info
        JPanel name = myStyledText("username", user.name, frame);
        info.add(name);

        // current time
        JPanel time = myStyledText("time", "00:00", frame);
        info.add(time);

        // best time
        JPanel bestTime = myStyledText("best time", "88:88", frame);
        info.add(bestTime);

        // score
        JPanel score = myStyledText("score", "1234", frame);
        info.add(score);

        // best score
        JPanel bestScore = myStyledText("best score", "9999", frame);
        info.add(bestScore);

        // games played
        JPanel games = myStyledText("games played", String.valueOf(user.gamesPlayed), frame);
        info.add(games);

        container.add(info, BorderLayout.WEST);



        // board
        JPanel gameSection = new JPanel();
        gameSection.setLayout(new BorderLayout());

        // player section
        JPanel player = new JPanel();
        player.setLayout(new GridLayout(12,1));

        int[] temp = {0, 0, 0, 0};
        fillArray();

        player.add(Row.getRow("?", temp));

        for(int i = 0; i < rows.length; i++){
            player.add(Row.getRow(String.valueOf(rows.length-1-i), rows[i]));
        }



        gameSection.add(player, BorderLayout.WEST);

        container.add(gameSection, BorderLayout.CENTER);

        frame.myFrame.add(container, BorderLayout.CENTER);
        frame.myFrame.setVisible(true);


    }




    private JPanel myStyledText(String title, String content, Frame frame){

        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());

        JLabel header = new JLabel();
        header.setPreferredSize(new Dimension(200, 50));
        header.setText(title);
        header.setFont(new Font("Century Gothic", Font.BOLD, 12));
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setVerticalAlignment(JLabel.BOTTOM);
        header.setOpaque(true);
        header.setForeground(frame.WHITE);
        header.setBackground(frame.BLACK);
        container.add(header, BorderLayout.NORTH);

        JLabel text = new JLabel();
        text.setText(content);
        text.setFont(new Font("Century Gothic", Font.BOLD, 26));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setVerticalAlignment(JLabel.TOP);
        text.setOpaque(true);
        text.setForeground(frame.WHITE);
        text.setBackground(frame.BLACK);
        container.add(text, BorderLayout.CENTER);

        return container;
    }
}
