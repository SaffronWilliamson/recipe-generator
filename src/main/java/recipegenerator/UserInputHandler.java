package recipegenerator;

import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner;

    //constructor shows scanner to main class
    public UserInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    //get user preferences
    public String[] getUserPreferences() {
        String[] userPreferences = new String[3];

        System.out.println("Would you like a vegetarian/ vegan recipe? (yes/no)");
        userPreferences[0] = scanner.nextLine();

        System.out.println("Would you like it to be spicy? (yes/no)");
        userPreferences[1] = scanner.nextLine();

        System.out.println("Would you like it to be low calorie? (yes/no)");
        userPreferences[2] = scanner.nextLine();

        return userPreferences;
    }

    //generate recipe based on user preferences
    public String generateRecipe(String[] preferences) {
        String veg = preferences[0];
        String spicy = preferences[1];
        String lowCal = preferences[2];

        if (veg.equalsIgnoreCase("yes") && spicy.equalsIgnoreCase("yes") && lowCal.equalsIgnoreCase("yes")) {
            return "Spicy low cal veg recipe";
        } else if (veg.equalsIgnoreCase("yes") && spicy.equalsIgnoreCase("yes")) {
            return "spicy veg recipe";
        } else if (veg.equalsIgnoreCase("yes") && lowCal.equalsIgnoreCase("yes")) {
            return "low cal veg Vegetarian recipe";
        } else if (veg.equalsIgnoreCase("yes")) {
            return "mild none veg recipe";
        }  else if (spicy.equalsIgnoreCase("yes") && lowCal.equalsIgnoreCase("yes")) {
            return "spicy low cal none veg recipe";
        } else if (spicy.equalsIgnoreCase("yes")) {
            return "spicy none veg non recipe";
        } else if (lowCal.equalsIgnoreCase("yes")) {
            return "low cal none veg non recipe";
        } else {
            return "non veg, non low cal non spicy recipe";
        }
    }
}


//decided this was the best way to handle user input for preferences

/*
TODO
-make this page look nicely presented
-error handle
-make sure inputs/outputs and clear and readable in the console
-fill in with the proper recipes
 */
