package com.cityweathergui;

public class User {

    private String userName;
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private int[] scores;

    public User() {

        userName = "-";
        firstName = "-";
        lastName = "-";
        gender = '-';
        age = -1;
        scores = new int[10] ;

    }

    public User(String userName, String firstName, String lastName, char gender, int age, int[] scores) {

        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.scores = scores;
        this.age = age;

    }

    String getUserName() {
        return this.userName;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    char getGender() {
        return this.gender;
    }

    int[] getScores() {
        return this.scores;
    }

    int getAge() {
        return this.age;
    }

    void setUserName(String userName) {
        this.userName = userName;
    }

    void setFirstName(String firstName) {
        this.userName = firstName;
    }

    void setLastName(String lastName) {
        this.userName = lastName;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    void setScores(int[] scores) {
        this.scores = scores;
    }

    String setAge(int age) {

        if (age > 0) {

            this.age = age;
            return("New age set");

        }
        else {

            return("You cannot have an negative age of an age of 0");

        }
    }

    int[] sortScores() {

        for (int i = 0; i < scores.length - 1; i++){
            int index  = i;
            for (int j = i + 1; j < scores.length; j++){
                if (scores[j] < scores[index]) {
                    index = j;
                }
            }

            if (index != i){
                int smallestNumber = scores[index];
                scores[index] = scores[i];
                scores[i] = smallestNumber;
            }

        }

        return scores;

    }

    public int length() {

        int length = MainMenu.userDatabase.length;
        return length;

    }

}
