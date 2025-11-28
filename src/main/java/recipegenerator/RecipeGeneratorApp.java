package recipegenerator;

import java.util.Scanner;

/*
Main class to run the programme.
Guides thr user through the programme and generates a recipe based on user preferences.
Optionally provides a bonus recipe if the user wants one.
 */

public class RecipeGeneratorApp {
    public static void main(String[] args) {

        //the only scanner - is used in this class
        Scanner scanner = new Scanner(System.in);

        //show greeting page
        boolean continueProgramme = GreetingPage.showGreetingPage(scanner);

        //end programme if user does not want to continue and close scanner
        if (!continueProgramme) {
            scanner.close();
            return;
        }

        //collect user preferences
        UserInputHandler InputHandler = new UserInputHandler(scanner);
        String[] preferences = InputHandler.getUserPreferences();

        //generate recipe based on user preferences
        Recipe recipe = InputHandler.generateRecipe(preferences);

        //print recipe
        recipe.displayRecipe();

        //print random bonus recipe
        InputHandler.displayRandomRecipe(recipe);

        scanner.close();
    }
}