package recipegenerator;

import java.util.Scanner;

public class GreetingPage {
    public static boolean showGreetingPage(Scanner scanner) {
        //welcome message
        System.out.println("\u001B[35m" + "\n  \uD83D\uDC69\u200D\uD83C\uDF73 Welcome to The Recipe Generator! \uD83D\uDC68\u200D\uD83C\uDF73 \n" + "\u001B[0m");
        //first name
        System.out.print("Before we get started, please enter your first name: ");
        String firstName = scanner.nextLine();
        //ask user if they want to continue
        System.out.print("\n\uD83D\uDC4BHey " + firstName + "\uD83D\uDC4BAre you ready to generate a recipe? (yes/no): ");

        //provide message if user wants to continue or not
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("\nGreat! Let's get started...");
                return true;
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("\nThat's okay, maybe another time. Goodbye!");
                return false;
            } else {
                System.out.print("\nInvalid input. Please enter 'yes' or 'no': ");
            }
        }
    }
}

/*
TODO
- make this page look nicely presented
-error handle
-make sure inputs/outputs and clear and readable in the console
*/
