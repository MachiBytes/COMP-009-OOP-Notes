import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        
        String strName;
        int intAge;
        
        Scanner objStrInput = new Scanner(System.in);
        Scanner objIntInput = new Scanner(System.in);

        System.out.println("What's your name? ");

        strName = objStrInput.nextLine();

        System.out.println("How old are you? ");

        intAge = objIntInput.nextInt();

        System.out.println("Hello " + strName + ".");
        System.out.println("You are " + intAge + " years old.");

    }  // public static void main(String[] args)

} // public class Input1