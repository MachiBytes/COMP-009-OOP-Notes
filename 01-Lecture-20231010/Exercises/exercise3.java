/*
 * Here's a Java exercise that will help you practice both for loops and while loops:
 * 
 * Write a Java program that generates a multiplication table for a given number entered by the user. You should use
 * both a for loop and a while loop for this exercise.
 */

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        // Prompt the user for a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();

        // Generate multiplication table with for-loop
        System.out.println("\nMultiplication table of " + number + " using for-loop:");
        for (int i=1; i<=10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

        // Generate multiplication table with while loop
        System.out.println("\nMultiplication table of " + number + " using while-loop:");
        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + number * multiplier);
            multiplier++;
        }

    }    
}
