package com.cityweathergui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainMenu extends JFrame{

    public static User [] userDatabase = new User[10];

    private JPanel mainMenuPanel;
    private JButton newUserButton;
    private JButton existingUserButton;

    public MainMenu(String title) {

        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainMenuPanel);
        this.pack();

        newUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewUser obj = new NewUser("New User");
                obj.setVisible(true);
                dispose();
            }
        });

        existingUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExistingUser obj = new ExistingUser("Existing User");
                obj.setVisible(true);
                dispose();
            }
        });

    }

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < MainMenu.userDatabase.length; i++){

            MainMenu.userDatabase[i] = new User();

        }

        JFrame frame = new MainMenu("Main Menu");
        frame.setVisible(true);

    }

}
