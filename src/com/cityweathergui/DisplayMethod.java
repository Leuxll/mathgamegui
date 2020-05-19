package com.cityweathergui;

import com.sun.tools.javac.Main;

import java.io.IOException;

public class DisplayMethod {

    public static String CreateHTMLTable() throws IOException {

        User Database = new User();
        LoadData.LoadFile();
        String HTMLString = "<html><body><tr>" +
                "<th><font color = \"red\">City</font></th>" +
                "<th><font color = \"red\">Windspeed</font></th>" +
                "<th><font color = \"red\">Temperatures</font></th>";

        for (int i = 0 ; i < MainMenu.userDatabase.length; i++) {



        }

        HTMLString += "</table></html>";
        return HTMLString;
    }

}
