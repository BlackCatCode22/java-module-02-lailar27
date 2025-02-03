// LargestOfThree.java
// lR 2/3/25

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        System.out.println("\n\n******* Welcome to my Largest of Three program! *******\n\n");

        // Create a scanner object to receive user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three integers
        System.out.println("Please enter integer1: ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter integer2: ");
        int num2 = scanner.nextInt();

        System.out.println("Please enter integer3: ");
        int num3 = scanner.nextInt();

        // Determine largest integer received from user
        int largest;

        if (num1 >= num2 & num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 & num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Output largest integer
        System.out.println("The largest integer is: " + largest);

    }
}
