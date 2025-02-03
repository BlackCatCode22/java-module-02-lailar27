// reverseString.java
// lR 2/3/25

import java.util.Scanner;

public class MadnessWithMethods 
{
    public static void main(String[] args) {
        System.out.println("\n\n******* Welcome to my Madness With Methods program! *******\n\n");

        // Prompt user to enter two integers
        int num1 = getAnIntFromTheUser("Please enter Integer1: ");
        int num2 = getAnIntFromTheUser("Please enter Integer2: ");

        // Compare two integers from user
        compareTwoInts(num1, num2);

        // Sum two integers from user
        int sum = sumTwoInts(num1, num2);
        System.out.println("The sum of the two integers is: " + sum);
    }

        // Function to receive integer
        public static int getAnIntFromTheUser(String prompt) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Try again");
                scanner.next();
                System.out.print(prompt);
            }
            return scanner.nextInt();
        }
        
        // Function to compare integers received from user
        public static void compareTwoInts(int a, int b) {
                if (a > b) {
                    System.out.println(a + " is greater than " + b);
                } else if (a < b) {
                    System.out.println(a + " is less than " + b);
                } else {
                    System.out.println(a + " is equal to " + b);
                }
        }

        // Function to sum integers received from user and display result
        public static int sumTwoInts(int a, int b) {
                return a + b;
            }

        }

