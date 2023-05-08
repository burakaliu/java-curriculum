/*
 * Week 2: Data Types and Variables
 * Understanding data types (int, double, boolean, etc.)
 * Declaring and initializing variables
 * Basic arithmetic operations
 */

class Week2 {
    public static void main(String[] args) {
        // Declaring and initializing variables of different data types
        int a = 5;
        double b = 3.14;
        boolean c = true;
        char d = 'A';
        
        // Basic arithmetic operations
        int sum = a + 10;
        double product = b * 2;
        boolean isEqual = a == 5;
        char nextChar = (char)(d + 1);
        
        // Printing the values of variables
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d);
        System.out.println("Value of sum: " + sum);
        System.out.println("Value of product: " + product);
        System.out.println("Value of isEqual: " + isEqual);
        System.out.println("Value of nextChar: " + nextChar);
    }
}
