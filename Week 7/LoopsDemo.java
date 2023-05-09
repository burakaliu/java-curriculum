import java.util.Scanner;

/*
 * This program uses a while loop to count from 1 to 10, a for loop to print even numbers between 1 and 10, and a do-while loop to get user input until a valid number is entered. 
 * It also shows how to use the break statement to exit a loop early, and how to use a while loop to keep asking the user for input until they enter "quit". 
 * Finally, it uses a for loop to print a multiplication table for a given number, and the continue statement to skip odd numbers.
 */
import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using a while loop to count from 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Using a for loop to print even numbers between 1 and 10
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        // Using a while loop to get user input until a valid number is entered
        int number;
        do {
            System.out.print("Enter a positive integer: ");
            number = scanner.nextInt();
        } while (number <= 0);

        // Using a for loop to calculate the sum of the first n positive integers
        int sum = 0;
        for (int k = 1; k <= number; k++) {
            sum += k;
        }
        System.out.println("The sum of the first " + number + " positive integers is " + sum);

        // Using a while loop to keep asking the user for input until they enter 'quit'
        String input;
        while (true) {
            System.out.print("Enter a word (or 'quit' to exit): ");
            input = scanner.next();
            if (input.equals("quit")) {
                break;
            }
            System.out.println("You entered: " + input);
        }

        // Using a for loop to print a multiplication table for a given number
        // The first line of the code prompts the user to enter a number, which will be used to generate the multiplication table. The input is taken using the scanner class and stored in the variable tableNumber.

        // The for loop starts on the next line and will execute 10 times, because the condition (l <= 10) is true for values of l from 1 to 10. The variable l is initialized to 1 before the loop starts and increments by 1 each time the loop runs.

        // Inside the loop, the multiplication table is printed to the console using System.out.println(). The statement contains four parts:

        //     1. tableNumber represents the number that the multiplication table is being generated for.
        //     2. " x " is a string literal that separates the multiplier and the multiplicand in the table.
        //     3. l represents the multiplier in the table.
        //     4. (tableNumber * l) represents the product of tableNumber and l, which is the result that is being printed.
        //     5. The output of each iteration of the loop will be a line of the multiplication table. The loop will continue to run until l equals 10, at which point the loop will terminate.

        // In summary, the code uses a for loop to print a multiplication table for a given number entered by the user. The loop iterates 10 times, with each iteration printing a line of the table to the console.
        System.out.print("Enter a number to print a multiplication table for: ");
        int tableNumber = scanner.nextInt();
        for (int l = 1; l <= 10; l++) {
            System.out.println(tableNumber + " x " + l + " = " + (tableNumber * l));
        }

        // Using continue to skip odd numbers
        //This is a simple Java program that demonstrates the use of the continue statement in a for loop.
        // The for loop iterates from 1 to 10 using the counter variable m. Inside the loop, the if statement checks whether the current value of m is an odd number.
        // If the value of m is odd, then the continue statement is executed, which immediately skips the rest of the current iteration of the loop and jumps to the next iteration. This means that the System.out.print(m + " "); statement is skipped for odd values of m.
        // If the value of m is even, then the if statement is not true and the System.out.print(m + " "); statement is executed, printing the current value of m followed by a space.
        // After the loop completes, a new line is printed using System.out.println(); to separate the output from any subsequent output.
        // Overall, this program prints the even numbers between 1 and 10, skipping the odd numbers using the continue statement inside the loop.
        for (int m = 1; m <= 10; m++) {
            if (m % 2 != 0) {
                continue;
            }
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
