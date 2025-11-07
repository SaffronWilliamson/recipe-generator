package recipegenerator;

import java.util.Scanner;

public class RecipeApp {
    public static void main(String[] args) {
        //the only scanner - is used in this class
        Scanner scanner = new Scanner(System.in);

        //show greeting page
        boolean continueProgramme = GreetingPage.showGreetingPage(scanner);

        //end programme if user does not want to continue and close scanner
        if (!continueProgramme) {
            scanner.close();
        }

        //collect user preferences
        UserInputHandler InputHandler = new UserInputHandler(scanner);
        String[] preferences = InputHandler.getUserPreferences();

        //generate recipe based on user preferences
        Recipe recipe = InputHandler.generateRecipe(preferences);
        //print recipe
        recipe.displayRecipe();

        //close scanner
        scanner.close();

    }
}
