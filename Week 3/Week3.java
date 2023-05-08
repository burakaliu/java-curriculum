/*
 * Week 3: Operators and Expressions
 * Understanding operators (+, -, *, /, %)
 * Compound assignment operators (+=, -=, *=, /=, %=)
 * Increment and decrement operators (++ and --)
 */

class Week3 {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 5;
        int b = 2;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        
        // Compound assignment operators
        int c = 10;
        c += 5; // equivalent to c = c + 5;
        c -= 3; // equivalent to c = c - 3;
        c *= 2; // equivalent to c = c * 2;
        c /= 4; // equivalent to c = c / 4;
        c %= 3; // equivalent to c = c % 3;
        
        // Increment and decrement operators
        int d = 7;
        d++; // equivalent to d = d + 1;
        int e = 3;
        e--; // equivalent to e = e - 1;
        
        // Printing the values of variables
        System.out.println("Value of sum: " + sum);
        System.out.println("Value of diff: " + diff);
        System.out.println("Value of product: " + product);
        System.out.println("Value of quotient: " + quotient);
        System.out.println("Value of remainder: " + remainder);
        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d);
        System.out.println("Value of e: " + e);
    }
}
