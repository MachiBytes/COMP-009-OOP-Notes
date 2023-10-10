/*
 * Here's a Java exercise that will help you practice using Scanner and conditional statements, including both 
 * if-else and switch statements
 * 
 * Write a Java program that calculates and displays a letter grade for a given numerical score entered by the user 
 * using an if-else statement. Display a comment after the letter grade depending on the grade given using a switch
 * statement.
 * 
 * Letter grades:
 *  A - 90+
 *  B - 80 to 89
 *  C - 70 to 79
 *  D - 60 to 69
 *  F - 59 and below
 * 
 * Comments:
 *  A - Excellent
 *  B - Good
 *  C - Satisfactory
 *  D - Needs Improvement
 *  F - Failing
 */

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        // Take user input; Integer grade
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your numerical grade? ");

        double numericalGrade = scanner.nextDouble();

        // Evaluate letter grade of numerical grade using an if-else statement
        char letterGrade;

        if (numericalGrade >= 90) {
            letterGrade = 'A';
        } else if (numericalGrade >= 80 && numericalGrade < 90) {
            letterGrade = 'B';
        } else if (numericalGrade >= 70 && numericalGrade < 80) {
            letterGrade = 'C';
        } else if (numericalGrade >= 60 && numericalGrade < 70) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Add comment based on letter grade using a switch statement
        String comment;

        switch (letterGrade) {
            case 'A':
                comment = "Excellent";
                break;
            case 'B':
                comment = "Good";
                break;
            case 'C':
                comment = "Satisfactory";
                break;
            case 'D':
                comment = "Needs Improvement";
                break;
            default:
                comment = "Failing";
        }

        // Print lahat
        System.out.println("Numerical Grade: " + numericalGrade);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("Comment: " + comment);
    }
}
