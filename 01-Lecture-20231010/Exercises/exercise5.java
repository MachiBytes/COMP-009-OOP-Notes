/*
 * Here's a Java exercise that will help you practice using for-each loops with arrays:
 * 
 * Write a Java program that uses a for-each loop to find and count even numbers in an integer array.
 */

import java.util.Arrays;

public class exercise5 {
    public static void main(String[] args) {
        int[] numbers = {34, 72, 15, 46, 89, 20, 53, 68};
        int[] evens = new int[numbers.length];
        int evens_ctr = 0;

        for (int number: numbers) {
            if (number % 2 == 0) {
                evens[evens_ctr] = number;
                evens_ctr++;
            }
        }

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.print("Even Numbers: [");
        for (int i=0; i<evens_ctr-1; i++) {
            System.out.print(evens[i] + ", ");
        }
        System.out.println(evens[evens_ctr-1] + "]");
        System.out.println("Total Even Numbers:" + evens_ctr);

    }
}
