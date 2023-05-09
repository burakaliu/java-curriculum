import java.util.Scanner;

/*
 * In this program, the user is asked to enter a grade and a color. 
 * The program uses nested if statements to determine the letter grade corresponding to the numeric grade entered by the user. 
 * It then uses a switch statement to determine the name of the color entered by the user. 
 * The break statements in the switch statement are used to terminate each case. 
 * If the user enters an invalid grade or color, an appropriate error message is displayed.
 */

public class NestedSwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        int grade = scanner.nextInt();

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("You got an A!");
            } else if (grade >= 80) {
                System.out.println("You got a B.");
            } else if (grade >= 70) {
                System.out.println("You got a C.");
            } else if (grade >= 60) {
                System.out.println("You got a D.");
            } else {
                System.out.println("You failed.");
            }
        } else {
            System.out.println("Invalid grade.");
        }

        System.out.print("Enter a color (red, green, or blue): ");
        String color = scanner.next();

        switch (color) {
            case "red":
                System.out.println("The color is red.");
                break;
            case "green":
                System.out.println("The color is green.");
                break;
            case "blue":
                System.out.println("The color is blue.");
                break;
            default:
                System.out.println("Invalid color.");
                break;
        }
    }
}
