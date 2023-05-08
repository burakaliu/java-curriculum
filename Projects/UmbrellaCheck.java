package Projects;

/*
 * A program that declares and initializes two variables, isRaining and hasUmbrella, 
 * and prints a message indicating whether or not the person needs an umbrella
 * 
 * In this program, we declare and initialize two boolean variables, isRaining and hasUmbrella, and use an if statement to 
 * check whether it is raining and whether the person has an umbrella. 
 * If it is raining and the person doesn't have an umbrella, we print a message indicating that the person needs an umbrella. 
 * Otherwise, we print a message indicating that the person doesn't need an umbrella.
 */

public class UmbrellaCheck {
    public static void main(String[] args) {
      boolean isRaining = true;
      boolean hasUmbrella = false;
      
      if (isRaining && !hasUmbrella) {
        System.out.println("You need an umbrella.");
      } else {
        System.out.println("You don't need an umbrella.");
      }
    }
  }
  
