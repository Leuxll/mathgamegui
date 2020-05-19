package com.cityweathergui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewUser extends JFrame{
    private JPanel newUserPanel;
    private JTextField ageTextField;
    private JTextField genderTextField;
    private JTextField lastNameTextField;
    private JTextField firstNameTextField;
    private JTextField userNameTextField;
    private JButton createNewUserButton;
    private JButton mainMenuButton;
    private JLabel updateLabel;

    public NewUser(String title) {

        super(title);
        this.setContentPane(newUserPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu obj = new MainMenu("Main Menu");
                obj.setVisible(true);
                dispose();
            }
        });

        createNewUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (ageTextField.getText().matches("[0-9]+")) {

                    if (Methods.AddUser(userNameTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), genderTextField.getText().charAt(0), Integer.valueOf(ageTextField.getText()))) {
                        updateLabel.setForeground(Color.black);
                        updateLabel.setText("User " + userNameTextField.getText() + " has been added to the database.");

                    } else {

                        updateLabel.setForeground(Color.red);
                        updateLabel.setText("Database is full, " + userNameTextField.getName() + " has not been added to the database.");

                    }

                } else {

                    updateLabel.setText("City not update, please verify data");
                    updateLabel.setForeground(Color.red);

                }

            }
        });

    }

    public static void main(String[] args) {

        JFrame frame = new NewUser("New User");
        frame.setVisible(true);

    }

}
