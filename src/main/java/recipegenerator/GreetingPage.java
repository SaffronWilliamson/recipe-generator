package recipegenerator;

import java.util.Scanner;

public class GreetingPage {
    public static boolean showGreetingPage() {
        //import scanner
        Scanner scanner = new Scanner(System.in);
        //welcome message
        System.out.println("Welcome to the Recipe Generator!");
        //first name
        System.out.print("Before we get started, please enter your first name: ");
        String FirstName = scanner.nextLine();
        //ask user if they want to continue
        System.out.println("Hey " + FirstName + "! Are you ready to generate a recipe?");
        System.out.print("Please enter 'yes' or 'no': ");

        //povide message if user wants to continue or not
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Great! Let's get started...");
                return true;
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("That's okay, maybe another time. Goodbye!");
                return false;
            } else {
                System.out.print("Invalid input. Please enter 'yes' or 'no': ");
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
