package com.cityweathergui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadData {

    public static void LoadFile() throws IOException {

        String filePath = System.getProperty("user.dir") + "/datafile.txt";
        System.out.println(filePath);
        BufferedReader dataIn;
        dataIn = new BufferedReader(new FileReader(filePath));

        int numberofLines = 0;

        while (dataIn.readLine() != null) {
            numberofLines++;
        }

        int numberOfUsers = numberofLines / 6;
        dataIn = new BufferedReader(new FileReader((filePath)));

        for (int i = 0; i < numberOfUsers; i++) {

            String userName = dataIn.readLine();
            String firstName = dataIn.readLine();
            String lasName = dataIn.readLine();
            char gender = dataIn.readLine().charAt(0);
            int age = Integer.parseInt(dataIn.readLine());
            String tempScores = dataIn.readLine();
            String[] tempScoresArray = tempScores.split(",");
            int[] scores = new int[tempScoresArray.length];

            for (int j = 0; j < scores.length; j++) {

                scores[j] = Integer.parseInt(tempScoresArray[j]);

            }

            MainMenu.userDatabase[i] = new User(userName, firstName, lasName, gender, age, scores);

        }

    }

}
