// reverseString.java
// lR 2/3/25

        import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("\n\n******* Welcome to my Reverse String Program! *******\n\n");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their String input
        System.out.println("\n Please enter a string: ");

        // get the input into our variable
        String input = scanner.nextLine();

        // Reverse user inputted String
        String reversedString = new StringBuilder(input).reverse().toString();

        // Display reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}

