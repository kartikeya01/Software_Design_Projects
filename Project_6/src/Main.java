// Created by: Kartikeya Sharma
// CSC22100 - Software Design Lab
// Created By: Kartikeya Sharma

import java.lang.Math;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main {

    public static void primeFactors (int input) {

        Set<Integer> set = new HashSet<>();

        while (input%2 == 0) {
            set.add(2);
            input /= 2;
        }

        for (int i = 3; i <= Math.sqrt(input); i+= 2) {
            while (input%i == 0) {
                set.add(i);
                input /= i;
            }
        }

        for (Integer num: set) {
            System.out.print(num + " ");
        }

        if (input > 2) {
            System.out.print(input);
        }
    }

    public static void main(String[] args) {

        boolean prime = true;
        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a whole number: ");

        int input = scan.nextInt();
        scan.close();

        if (input < 0) {
            System.out.println("Please enter a positive value!");
        } else {

            for (int i = 2; i <= input/2; i++) {
                temp = input%i;
                if (temp == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime == true) {
                System.out.println(input + " is a prime number.");
            } else {
                System.out.println(input + " is not a Prime Number.\nIt's unique prime factors are:");
                primeFactors(input);
            }
        }
    }
}
