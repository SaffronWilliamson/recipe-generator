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

        String response = "";
        System.out.println("Would you like a bonus random recipe? (yes/no)");
        while(true) {
            response = scanner.nextLine().toLowerCase();

            if (response.equals("yes")){
                Recipe randomRecipe = InputHandler.getRandomRecipe();
                randomRecipe.displayRecipe();
                break;
            } else if (response.equals("no")){
                System.out.println("No Problem. Happy Cooking!");
                break;
            } else {
                System.out.print("Invalid input. Please enter 'yes' or 'no': ");

            }
        }

        scanner.close();

    }
}

//TODO - make sure random recipe isn't the same as the previous recipe displayed
