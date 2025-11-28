package recipegenerator;

import java.util.Scanner;

/*
Displays the welcome message, asks the user if they want to continue.
Used to keep the user interface clean.
 */

//shows the initial welcome message and explains the purpose of the programme
public class GreetingPage {
    public static boolean showGreetingPage(Scanner scanner) {
        //welcome message
        System.out.println("\u001B[35m" + "\n  \uD83D\uDC69\u200D\uD83C\uDF73 Welcome to The Recipe Generator! \uD83D\uDC68\u200D\uD83C\uDF73 \n" + "\u001B[0m");
        System.out.print("Before we get started, please enter your first name: ");
        String firstName = scanner.nextLine().trim();

        //ask user if they want to continue
        System.out.print("\n\uD83D\uDC4BHey " + firstName + "\uD83D\uDC4B \nAre you ready to generate a recipe? (yes/no): ");

        //provide message if user wants to continue or not
        while (true) {
            String answer = scanner.nextLine().trim().toLowerCase();
            if(answer.isEmpty()){
                System.out.print("\nInvalid input. Please enter 'yes' or 'no': ");
                continue;
            }
            if (answer.charAt(0) == 'y') {
                System.out.println("\nGreat! Let's get started...");
                return true;
            } else if (answer.charAt(0) == 'n') {
                System.out.println("\nThat's okay, maybe another time. Goodbye!\uD83D\uDC4B");
                return false;
            } else {
                System.out.print("\nInvalid input. Please enter 'yes' or 'no': ");
            }
        }
    }
}