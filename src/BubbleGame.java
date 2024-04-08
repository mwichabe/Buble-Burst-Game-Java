import javax.swing.*;
import java.awt.event.*;

public class BubbleGame {
    private JFrame startFrame;
    private JFrame gameFrame;
    private JButton startButton;
    private JButton restartButton;
    private JSlider difficultySlider;

    public BubbleGame() {
        startFrame = new JFrame("Bubble Burst Game");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setSize(300, 200);

        startButton = new JButton("Start");
        restartButton = new JButton("Restart");
        difficultySlider = new JSlider(JSlider.HORIZONTAL, 4, 6, 4);

        JPanel panel = new JPanel();
        panel.add(startButton);
        panel.add(restartButton);
        panel.add(difficultySlider);

        startFrame.add(panel);
    }

    public void start() {
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });

        startFrame.setVisible(true);
    }

    private void startGame() {
        startFrame.dispose();

        gameFrame = new JFrame("Bubble Burst Game");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(600, 400);

        // Add code to create game field and handle game logic here

        gameFrame.setVisible(true);
    }
}
