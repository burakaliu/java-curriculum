package Projects;
/*
 * A program that declares and initializes a variable age, and prints a different 
 * message depending on whether the value of age is greater than or equal to 18
 * 
 * In this program, we declare and initialize a variable age, and use an if statement to check whether the value of age is greater than or equal to 18. 
 * If it is, we print a message indicating that the person is an adult. 
 * Otherwise, we print a message indicating that the person is a minor.
 */

public class AgeCheck {
    public static void main(String[] args) {
      int age = 21;
      
      if (age >= 18) {
        System.out.println("You are an adult.");
      } else {
        System.out.println("You are a minor.");
      }
    }
  }
  