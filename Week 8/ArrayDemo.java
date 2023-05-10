// A program that introduces arrays and their basic operations

// In this program, we first import the java.util.Arrays utility class, which provides several useful methods for working with arrays.

// Next, we declare an array of integers called numbers without initializing it. We then initialize the array with 5 elements using the new operator. 
// We add elements to the array by assigning values to each element.

// We then print the array using the Arrays.toString() method from the Arrays utility class. 
// Next, we sort the array using the Arrays.sort() method and print the sorted array.

// Finally, we search for the element 3 in the array using the Arrays.binarySearch() method and print its index.

// This is just a simple example, but it covers the basics of working with arrays in Java. 
// There are many more operations and methods available for working with arrays, so feel free to explore the Java documentation to learn more.

import java.util.Arrays; // Required to use the Arrays utility class

public class ArrayDemo {

  public static void main(String[] args) {

    // Declaring an array of integers
    int[] numbers;

    // Initializing the array with 5 elements
    numbers = new int[5];

    // Adding elements to the array
    numbers[0] = 2;
    numbers[1] = 7;
    numbers[2] = 3;
    numbers[3] = 9;
    numbers[4] = 1;

    // Printing the array
    System.out.println("Array before sorting: " + Arrays.toString(numbers));

    // Sorting the array in ascending order
    Arrays.sort(numbers);

    // Printing the sorted array
    System.out.println("Array after sorting: " + Arrays.toString(numbers));

    // Searching for an element in the array
    int searchNumber = 3;
    int index = Arrays.binarySearch(numbers, searchNumber);
    System.out.println(searchNumber + " is found at index " + index);
  }
}
