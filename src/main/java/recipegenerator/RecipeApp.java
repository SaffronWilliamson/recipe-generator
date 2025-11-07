package recipegenerator;

import java.util.Scanner;

public class RecipeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //show greeting page
        boolean continueProgramme = GreetingPage.showGreetingPage();

        //end programme if user does not want to continue and close scanner
        if (!continueProgramme) {
            scanner.close();
        }

    }
}
