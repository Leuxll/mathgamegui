package com.cityweathergui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMenu extends JFrame{
    private JPanel gameMenuPanel;
    private JButton startANewGameButton;
    private JButton displayUserWithTheButton;
    private JButton displayUsersScoresSortedButton1;
    private JButton displayUsersScoresSortedButton;
    private JButton logOutButton;

    public GameMenu(String title) {

        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(gameMenuPanel);
        this.pack();

        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu obj = new MainMenu("Main Menu");
                dispose();
            }
        });
        startANewGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new GameMenu("Game Menu");
        frame.setVisible(true);

    }

}
