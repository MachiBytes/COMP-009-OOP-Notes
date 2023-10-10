/*
 * Here's a Java exercise that will help you practice data types, strings, concatenation, and Scanners:
 * 
 * Write a Java program that prompts the user for their name and age, and then displays a message including their
 * name, age, and some additional information.
 * 
 * Program Criteria
 * - Must use the appropriate Scanner method for each input (String for name; Integer for age)
 * - Must have only one Scanner
 * - Name input must allow inputs with spaces
 */

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name 
        System.out.println("What is your name?");

        // Read the user's input using the Scanner
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.println("How old are you?");

        // Read the user's input using the Scanner
        int age = scanner.nextInt();

        // Print the user inputs in the ff. format: "Hello, [name]. You are [age] years old!"
        System.out.println("Hello, " + name + ". You are " + age + " years old!");

    }
}
