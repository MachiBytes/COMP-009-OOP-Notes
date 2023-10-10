/*
 * Here's a Java exercise that will help you practice working with arrays:
 * 
 * Write a Java program that performs various operations on an integer array. You will practice creating, populating, 
 * and manipulating arrays.
 * 
 * Create an empty array with a length of 5 and get user input for their values.
 * Print the original array then print the ff:
 *  Sum of elements
 *  Maximum element
 *  Minimum Element
 *  Reversed Array
 */

import java.util.Scanner;
import java.util.Arrays;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Please enter 5 integer values:");
        for (int i=0; i<numbers.length; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array Elements: " + Arrays.toString(numbers));
        System.out.println();

        int sum = 0;
        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;  // Type-cast sum to double to preserve precision of decimal

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        System.out.println("Maximum element: " + maximum);
        System.out.println("Minimum element: " + minimum);

        System.out.print("Reversed Array: [");
        for (int i=numbers.length-1; i>0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[0] + "]");

    }
}