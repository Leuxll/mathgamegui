package com.cityweathergui;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveFile {

    public static void SaveData() throws IOException {

        PrintWriter dataOut;

        dataOut = new PrintWriter (new FileWriter("datafile.txt"));

        for (int i = 0; i < MainMenu.userDatabase.length; i++) {

            if (MainMenu.userDatabase[i].getGender() > -1) {

                dataOut.println(MainMenu.userDatabase[i].getUserName());
                dataOut.println(MainMenu.userDatabase[i].getFirstName());
                dataOut.println(MainMenu.userDatabase[i].getLastName());
                dataOut.println(MainMenu.userDatabase[i].getAge());
                dataOut.println(MainMenu.userDatabase[i].getGender());

                int scores [] = MainMenu.userDatabase[i].getScores();

                for (int j = 0; j < scores.length; j++) {

                    scores[i] = -1;

                }

            } else
                break;
        }

        dataOut.close();

    }

}
