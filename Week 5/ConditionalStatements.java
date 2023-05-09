import java.util.Scanner;

/**
 * A simple Java program that demonstrates the use of conditional statements (if, else) and logical operators (&&, ||, !).
 * In simple terms, this Java program prompts the user to enter various inputs and uses conditional statements (if, else) and logical operators (&&, ||, !) to check the validity of the inputs and print appropriate messages.
 * The program checks the age of the user and prints a message based on whether they are a minor, adult, or senior citizen. 
 * It also checks if the user entered a positive even number, a number between 1 and 100 (inclusive), 
 * and a number that is not equal to 0, and prints appropriate messages based on the input.
 */
public class ConditionalStatements {

    /**
     * The main method of the program that prompts the user to enter various inputs and uses conditional statements
     * and logical operators to check the validity of the inputs and print appropriate messages.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Use conditional statements to check the user's age and print a message accordingly
        if (age < 0) {
            System.out.println("Error: Invalid age");
        } else if (age < 18) {
            System.out.println("You are a minor");
        } else if (age < 65) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }

        // Use logical operators to check if the user entered a positive even number
        System.out.print("Enter a positive even number: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Error: Invalid number");
        } else if (num % 2 != 0) {
            System.out.println("Error: Not an even number");
        } else {
            System.out.println("Valid input");
        }

        // Use logical operators to check if the user entered a number between 1 and 100 (inclusive)
        System.out.print("Enter a number between 1 and 100: ");
        int n = input.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Error: Number out of range");
        } else {
            System.out.println("Valid input");
        }

        // Use logical operators to check if the user entered a number that is not equal to 0
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        if (x != 0) {
            System.out.println("Valid input");
        } else {
            System.out.println("Error: Number cannot be 0");
        }

        input.close();
    }
}
