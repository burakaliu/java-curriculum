/*
 * This program does the following:
 * Reads input from the user using the Scanner class and outputs a personalized message using System.out.
 * Writes the personalized message to a file named "output.txt" using a FileWriter.
 * Reads the contents of a file named "input.txt" using a Scanner.
 * Appends a message to the end of "output.txt" using a PrintWriter
 */
import java.util.Scanner;
import java.io.*;

public class Week4 {
    public static void main(String[] args) {
        // Reading user input using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Writing output to a file
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, " + name + "!");
            writer.close();
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading input from a file
        File file = new File("input.txt");
        String fileContent = "";
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                fileContent += fileScanner.nextLine();
            }
            fileScanner.close();
            System.out.println("Contents of input.txt: " + fileContent);
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }

        // Writing output to a file using PrintWriter
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("output.txt", true));
            printWriter.println("Welcome to Java programming!");
            printWriter.close();
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
