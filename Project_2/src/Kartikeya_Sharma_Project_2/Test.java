package Kartikeya_Sharma_Project_2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many levels should the tree have?");
        int T = input.nextInt();

        System.out.println("What is the probability of going up?");
        int P = input.nextInt();

        System.out.println("How many levels do you want to navigate?");
        int N = input.nextInt();

        Node tree = BinaomialTreeFactory.Create(T, P);

        Navigation nav = new Navigation();
        nav.Navigate(tree, N);

    }
}