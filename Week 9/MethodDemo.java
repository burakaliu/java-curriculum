// A program that introduces methods and their basic usage

// In this program, we define two methods. The first method is printWelcomeMessage(), which simply prints a welcome message to the console. 
// The second method is printSquare(int num), which takes an integer argument num, calculates its square, and prints the result to the console.

// In the main() method, we invoke the printWelcomeMessage() method, which simply prints the welcome message to the console. 
// We then invoke the printSquare(int num) method twice with different arguments (5 and 7) to print their squares.

// Note that we pass the arguments to the printSquare() method using parentheses after the method name, separated by commas. 
// The method then uses the argument to calculate the square and print the result.

// This is just a simple example, but it covers the basics of defining and invoking methods in Java, as well as passing arguments to them. 
// There are many more advanced features and concepts related to methods, so feel free to explore the Java documentation to learn more.

public class MethodDemo {

    // A simple method that prints a welcome message
    public static void printWelcomeMessage() {
      System.out.println("Welcome to my program!");
    }
  
    // A method that takes an integer argument and prints its square
    public static void printSquare(int num) {
      int square = num * num;
      System.out.println("The square of " + num + " is " + square);
    }
  
    public static void main(String[] args) {
  
      // Invoking the printWelcomeMessage() method
      printWelcomeMessage();
  
      // Invoking the printSquare() method with argument 5
      printSquare(5);
  
      // Invoking the printSquare() method with argument 7
      printSquare(7);
    }
  }
  