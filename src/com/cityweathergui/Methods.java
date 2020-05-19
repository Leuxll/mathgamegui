package com.cityweathergui;

import java.io.IOException;

public class Methods {

    public static boolean AddUser(String userName, String firstName, String lastName, char gender, int age) {

        boolean added = false;

        int scores [] = new int[10];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = -1;
        }

        for (int i = 0; i < MainMenu.userDatabase.length; i++) {
            if (MainMenu.userDatabase[i].getAge() > -1) {
                MainMenu.userDatabase[i] = new User(userName, firstName, lastName, gender, age, scores);
                added = true;
                break;
            }
        }

        try {
            SaveFile.SaveData();;
        } catch (IOException ex) {
            System.out.println("Error in saving file");
        }

        return added;
    }

}
