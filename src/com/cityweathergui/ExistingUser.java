package com.cityweathergui;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ExistingUser extends JFrame{
    private JPanel existingUserPanel;
    private JButton selectButton;
    private JTextField userNumber;
    private JEditorPane editorPane1;
    private JButton mainMenuButton;

    public ExistingUser(String title) {

        super(title);
        this.setContentPane(existingUserPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        editorPane1.setEnabled(false);
        editorPane1.setContentType("text/html");
        try {
            editorPane1.setText(Methods.CreateHTMLTable());
        } catch (IOException e) {
            System.out.println("Can not load file");
        }

        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu obj = new MainMenu("Main Menu");
                dispose();
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new ExistingUser("Existing User");
        frame.setVisible(true);

    }

}
