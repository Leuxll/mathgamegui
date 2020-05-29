package com.cityweathergui;

import java.io.IOException;
import java.util.Arrays;

public class Methods {

    public static boolean AddUser(String userName, String firstName, String lastName, char gender, int age) {

        boolean added = false;

        int scores [] = new int[10];

        for (int i = 0; i < MainMenu.userDatabase.length; i++) {
            if (MainMenu.userDatabase[i].getAge() == -1) {
                for (int j = 0; j < scores.length; j++) {
                    scores[j] = -1;
                }
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

    public static String CreateHTMLTable() throws IOException {

        User Database = new User();
        LoadData.LoadFile();
        String HTMLString = "<html><body><tr>" +
                "<th><font color = \"red\">Username</font></th>" +
                "<th><font color = \"red\">First name</font></th>" +
                "<th><font color = \"red\">Last name</font></th>" +
                "<th><font color = \"red\">Gender</font></th>" +
                "<th><font color = \"red\">Age</font></th>" +
                "<th><font color = \"red\">Scores</font></th>";

        for (int i = 0 ; i < MainMenu.userDatabase.length; i++) {

            if (MainMenu.userDatabase[i].getUserName().equals("-") == false){

                String gender = String.valueOf(MainMenu.userDatabase[i].getGender());

                HTMLString += "<tr>";
                HTMLString += "<td>" + MainMenu.userDatabase[i].getUserName() + "</td>";
                HTMLString += "<td>" + MainMenu.userDatabase[i].getFirstName() + "</td>";
                HTMLString += "<td>" + MainMenu.userDatabase[i].getLastName() + "</td>";
                HTMLString += "<td>" + gender + "</td>";
                HTMLString += "<td>" + MainMenu.userDatabase[i].getAge() + "</td>";
                HTMLString += "<td>" + Arrays.toString(MainMenu.userDatabase[i].getScores()) + "</td>";
                HTMLString += "</tr>";

            } else {
                break;
            }

        }

        HTMLString += "</table></html>";
        return HTMLString;
    }

}
