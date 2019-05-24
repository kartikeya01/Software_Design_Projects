import java.util.Scanner;

public class CheckProtection {

    public static void main(String[] args) {

        System.out.println("Input the dollar amount to be printed on a check:"); // Request input
        Scanner input = new Scanner(System.in); // Take input and store in "input"
        double inputValue = input.nextDouble(); // Store as a double (to account for cents)
        String inputValueToString = Double.toString(inputValue); // Put everything in a string

        StringBuilder checkValueHolder = new StringBuilder("*********"); // Prebuild a string of 9 *'s

        if (inputValueToString.length() <= 9) { // If input is <= 9, replace * in checkValueHolder with input chars
            int inputLength = inputValueToString.length()-1;
            int holderLength = checkValueHolder.length()-1;

            while (inputLength >= 0) {
                checkValueHolder.setCharAt(holderLength--, inputValueToString.charAt(inputLength--) );
            }

            System.out.println(checkValueHolder);
        } else { // Othereise, if not compatible, print this
            System.out.println("Input not compatible with check protector. Try Again!");
        }
    }
}
