package Kartikeya_Sharma_Project_2;

import java.security.SecureRandom;

public class Navigation {

    public void Navigate(Node tree, int N) {
        Node treeTraverse = tree;
        int iterations = 0;

        for (int i = 0; i < N; i++) {
            int timePeriod = 0;

            iterations++;

            System.out.println("Iteration " + iterations);
            System.out.println("\n");

            while (treeTraverse != null) {

                SecureRandom randomVariable = new SecureRandom();
                int rand = randomVariable.nextInt(101); // Bounded from 0 (inclusive) to N=100 (exclusive)

                if (rand < tree.getValue()) {
                    treeTraverse = treeTraverse.getUp();
                    timePeriod++;
                    System.out.println("Time period: " + timePeriod + ", Random generated value: " + rand + ", Movement: UP");
                } else {
                    treeTraverse = treeTraverse.getDown();
                    timePeriod++;
                    System.out.println("Time period: " + timePeriod + ", Random generated value: " + rand + ", Movement: DOWN");
                }
            }

            treeTraverse = tree;
            System.out.println("\n");
        }

    }
}
