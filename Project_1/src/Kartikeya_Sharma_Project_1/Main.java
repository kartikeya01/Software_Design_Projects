package Kartikeya_Sharma_Project_1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

    /*
      Write a Java application that prompts for the person's information,
      instantiates an object of class HeartRates and prints the information
      from that object—including the person's first name, last name and date
      of birth—then calculates and prints the person's age in (years),
      maximum heart rate and target-heart-rate range.
    */
        HeartRates user;
        String firstName = JOptionPane.showInputDialog("What's your First Name?");
        String lastName = JOptionPane.showInputDialog("What's your Last Name?");
        int month = Integer.parseInt(JOptionPane.showInputDialog("What month were you born in?"));
        int day = Integer.parseInt(JOptionPane.showInputDialog("What day were you born in?"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("What year were you born in?"));

        // To account for incorrect inputs
        if (firstName.matches(".*\\d+.*") || lastName.matches(".*\\d+.*")) {
            JOptionPane.showMessageDialog(null, "Invalid Input - Enter a valid name");
        }
        else if(month > 12 || month < 1 || year < 1800 ||year > 2019) {
            JOptionPane.showMessageDialog(null, "Invalid Input - Enter a valid month/year");
        }
        else if((month == 2) && ((day > 28) || (day < 1))) {
            JOptionPane.showMessageDialog(null, "Invalid Input - Enter a valid date");
        }
        else if((month % 2 == 1) && (month <= 7) && ((day > 31) || (day < 1))) {
            JOptionPane.showMessageDialog(null, "Invalid Input - Enter a valid date");
        }
        else if((month % 2 == 0) && (month <= 7) && ((day > 30) || (day < 1))) {
            JOptionPane.showMessageDialog(null, "Invalid Input - Enter a valid date");
        }
        else if((month % 2 == 0) && (month > 7) && ((day > 31) || (day < 1))) {
            JOptionPane.showMessageDialog(null, "Invalid Input - Enter a valid date");
        }
        else if((month % 2 == 1) && (month > 7) && ((day > 30) || (day < 1))) {
            JOptionPane.showMessageDialog(null, "Invalid Input - Enter a valid date");
        }
        else {
            user = new HeartRates(firstName, lastName, month, day, year);
            user.display();
        }
    }
}

