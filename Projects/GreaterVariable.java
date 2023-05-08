package Projects;
/*
 * A program that declares and initializes two variables, x and y, and prints the value of the variable that has the greater value
 * In this program, we declare and initialize two variables, x and y, and use an if statement to check which variable has the greater value. 
 * If x is greater than y, we print the value of x. Otherwise, we print the value of y.
 */

public class GreaterVariable {
    public static void main(String[] args) {
      int x = 5;
      int y = 8;
      
      if (x > y) {
        System.out.println("The greater variable is x: " + x);
      } else {
        System.out.println("The greater variable is y: " + y);
      }
    }
  }
  