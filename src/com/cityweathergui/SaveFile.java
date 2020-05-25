package com.cityweathergui;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class SaveFile {

    public static void SaveData() throws IOException {

        PrintWriter dataOut;

        dataOut = new PrintWriter (new FileWriter("datafile.txt"));

        for (int i = 0; i < MainMenu.userDatabase.length; i++) {

            if (MainMenu.userDatabase[i].getAge() > -1) {

                dataOut.println(MainMenu.userDatabase[i].getUserName());
                dataOut.println(MainMenu.userDatabase[i].getFirstName());
                dataOut.println(MainMenu.userDatabase[i].getLastName());
                dataOut.println(MainMenu.userDatabase[i].getAge());
                dataOut.println(MainMenu.userDatabase[i].getGender());
                dataOut.println(Arrays.toString(MainMenu.userDatabase[i].getScores()));

            } else
                break;
        }

        dataOut.close();

    }

}
