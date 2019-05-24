package Kartikeya_Sharma_Project_1;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class HeartRates {

    /*
      Create a class called HeartRates. The class attributes should include
      the person’s first name, last name and date of birth (consisting of
      separate attributes for the month, day and year of birth).
    */

    private String firstName;
    private String lastName;
    // Date of birth
    private int month;
    private int day;
    private int year;

    /*
      Your class should have a constructor that receives this data as
      parameters. For each attribute provide set and get methods.
    */

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getFirstName() {
            return firstName;
        }
    public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

    public String getLastName() {
            return lastName;
        }
    public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    public int getMonth() {
            return month;
        }
    public void setMonth(int month) {
            this.month = month;
        }

    public int getDay() { return day; }
    public void setDay(int day) {
            this.day = day;
        }

    public int getYear() {
            return year;
        }
    public void setYear(int year) {
            this.year = year;
        }

    /*
      The class also should include a method that calculates and returns
      the person’s age (in years), a method that calculates and returns the
      person’s maximum heart rate and a method that calculates and returns
      the person’s target heart rate.
    */

    public int age() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int todays_month = cal.get(Calendar.MONTH) + 1;
        int todays_year = cal.get(Calendar.YEAR);

        int month_rounded_to_year = todays_month - getMonth();

        if (month_rounded_to_year >= 5) {
            month_rounded_to_year = 1;
        } else {
            month_rounded_to_year = 0;
        }

        int total_age = ((todays_year - getYear()) + month_rounded_to_year) - 1;

        return total_age;
    }

    /*
      The formula for calculating your maximum heart rate in beats per minute
      is 220 minus your age in years. Your target heart rate is a range that's
      50-85% of your maximum heart rate.
    */

    public int maximum_heart_rate() {
        return (220 - age());
    }

    public String target_heart_rate() {

        double lowerBound = maximum_heart_rate() * 0.50;
        double upperBound = maximum_heart_rate() * 0.85;

        return (lowerBound + " -- " + upperBound);
    }

    public void display(){
        JOptionPane.showMessageDialog(null,
                "Name: " + getFirstName() + " " + getLastName() + "\n" +
                        "DoB: " + getMonth() + "/" + getDay() + "/" + getYear() + "\n" +
                        "Age: " + age() + "\n" +
                        "Your maximum heart rate is: " + maximum_heart_rate() + "\n" +
                        "Your target heart rate range is: " + target_heart_rate());
    }
}
