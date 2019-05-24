## Project 1

Create a class called HeartRates. The class attributes should include the person's first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that calculates and returns the person's age (in years), a method that calculates and returns the person's maximum heart rate and a method that calculates and returns the person's target heart rate. Write a Java application that prompts for the person's information, instantiates an object of class HeartRates and prints the information from that object—including the person's first name, last name and date of birth—then calculates and prints the person's age in (years), maximum heart rate and target-heart-rate range.

## Project 2

1. Create a factory class that builds a binomial tree given two parameters

  a. T in integer to indicate the number of time periods.  This is the depth or the length of the tree.  The width the height of the tree at the time period T is 2^T. 

  b. P in integer between 0 and 100 to indicate the probability of up price movement.  The probability of down price movement is 100-P.


Note:  The factory needs to be implemented as public final class with a static method.  Refer to the following as an example.


public final class BinaomialTreeFactory {

	public static Node create(int T, int P) {

	}

}


2. Create a navigator with one parameter N, for the number of iterations.  For each iteration:  

  a. Starting from the root node, time zero, call the random function.  If the number is between 0 and P, traverse to up-node for the next time period.  If the number is between P and 100, traverse to down-node for the next time period.

  b. Repeat step a, until the time T is reached.

  c. While traversing the binomial tree, print Time Period, value generated by the random function, and the movement (UP or DOWN)

## Project 3

Add an appropriate set of overloading/overriding methods to support the object hierarchy assumed in this context. Implement the hierarchy, populate Database with at least two items per non-abstract class, and show the "unsorted" and "sorted" list of the set of those instances. The minimal requirement of this assignment is to realize the database sort based on the lexicographical order of id as well as any combination of data variables. For instance, database records are shown based on the lexicographical order of "title" followed by "addedOn" and followed by "director"

## Project 4 Q1

Use Java Fx: Create a Contacts application in JavaFx. Store the contacts information in an
ObservableList of Contact object. A contact should contain first name, last name, email
and phone number properties (You are free to provide others). When the user selects a contact
from the contacts list, its information should display in a Grid of Text Fields. As the
information is modified (A Contact’s data is updated, a new Contact is added or an existing
Contact is deleted), the contacts ListView should display the updates. The ListView should
display the Contact’s last name. Also provide a custom ListView that display’s the Contact’s
full name and picture with the names sorted by last name.

Note: The above project MUST be made using components and specification of JavaFx. Projects
that incorporate fully workable UI and are logically correct will be awarded full points. You are
free to create your own data models and class specifications. Bonus: Additional features will
fetch additional points!

## Project 4 Q2

Create a JavaFx mortgage calculator app that allows the users to enter a purchase price, down-
payment price, down-payment amount and interest rate. Based on these values, the app should
calculate the loan amount and display the monthly payment for 10-,20- and 30- year loans.
Allow the user to select a custom loan duration by using slider and display the monthly
payments.

Note: The above project MUST be made using components and specification of JavaFx. Projects
that incorporate fully workable UI and are logically correct will be awarded full points. You are
free to create your own data models and class specifications. Bonus: Additional features will
fetch additional points!

## Project 5

Write an application that inputs a dollar amount to be printed on a check, then prints the
amount in check-protected format with leading asterisks if necessary. Assume that nine spaces are
available for printing the amount.

## Project 6

Write a program that takes a whole number input from a user and determines whether it’s prime. If the
number is not prime, display its unique prime factors. Remember that a prime number’s factors are only
1 and the prime number itself. Every number that’s not prime has a unique prime factorization For
example, consider the number 54. The prime factors of 54 are 2,3,3 and 3. When the values are
multiplied together, the result is 54. For the number 54, the prime factors output should be 2 and 3. Use
Sets as part of your solution.

## Extra Credit

Create something in JavaFX related to animations.
