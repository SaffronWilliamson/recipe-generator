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

        System.out.println("Would you like a vegetarian recipe? (yes/no)");
        userPreferences[0] = scanner.nextLine();
        System.out.println("Would you like it to be spicy? (yes/no)");
        userPreferences[1] = scanner.nextLine();
        System.out.println("Would you like it to be low calorie? (yes/no)");
        userPreferences[2] = scanner.nextLine();

        return userPreferences;
    }

    //recipe objects
    Recipe spicyVegStirFry = new VegetarianRecipe(
            "Spicy, Veg Stir-fry",
            2,
            2,
            350,
            20,
            new String[]{"Broccoli", "Tofu", "Bell peppers", "Soy sauce"},
            "1. Chop vegetables and tofu.\n2. Stir-fry for 10 minutes.\n3. Add soy sauce and serve hot.",
            true);
    Recipe fieryChickpeaVegCurry = new Recipe(
            "Fiery Chickpea & Veg Curry",
            3,
            3,
            600,
            40,
            new String[]{"Chickpeas", "Spinach", "Tomatoes", "Onion", "Garlic", "Ginger", "Chilli powder", "Coconut milk"},
            "1. Sauté chopped onions, garlic, and ginger until golden.\n2. Add chilli powder and chopped tomatoes; cook 5 minutes.\n3. Stir in chickpeas and coconut milk; simmer 20 minutes.\n4. Add spinach and cook until wilted.\n5. Serve hot with rice or naan.");
    Recipe lightVeggieQuinoaBowl = new VegetarianRecipe(
            "Light Veggie Quinoa Bowl",
            0,
            2,
            280,
            25,
            new String[]{"Quinoa", "Zucchini", "Carrots", "Cherry tomatoes", "Spinach", "Lemon juice", "Olive oil"},
            "1. Cook quinoa according to package instructions.\n2. Steam zucchini, carrots, and spinach until tender.\n3. Toss quinoa with vegetables, cherry tomatoes, a drizzle of olive oil, and lemon juice.\n4. Serve warm or chilled.",
            true);
    Recipe creamyMushroomAndSpinachPasta = new VegetarianRecipe(
            "Creamy Mushroom & Spinach Pasta",
            0,
            4,
            800,
            30,
            new String[]{"Pasta", "Mushrooms", "Spinach", "Garlic", "Cream", "Parmesan cheese", "Olive oil"},
            "1. Cook pasta according to package instructions.\n2. Sauté garlic in olive oil until fragrant.\n3. Add mushrooms and cook until soft.\n4. Stir in cream and spinach, cooking until spinach wilts.\n5. Mix in pasta and top with Parmesan cheese before serving.",
            true);
    Recipe spicyGrilledChickenSalad = new MeatRecipe(
            "Spicy Grilled Chicken Salad",
            2,
            2,
            320,
            25,
            new String[]{"Chicken breast", "Mixed greens", "Cherry tomatoes", "Cucumber", "Red chilli flakes", "Lime juice", "Olive oil"},
            "1. Season chicken breast with chilli flakes, salt, and pepper.\n2. Grill chicken until fully cooked, about 6-8 minutes per side.\n3. Toss mixed greens, cherry tomatoes, and cucumber with lime juice and olive oil.\n4. Slice grilled chicken and place on top of salad.\n5. Serve immediately.",
            "chicken");
    Recipe fieryBeefAndPepperStirFry = new MeatRecipe(
            "Fiery Beef & Pepper Stir-fry",
            3,
            3,
            750,
            30,
            new String[]{"Beef strips", "Bell peppers", "Onion", "Garlic", "Ginger", "Chilli sauce", "Soy sauce", "Sesame oil"},
            "1. Sauté garlic and ginger in sesame oil until fragrant.\n2. Add beef strips and cook until browned.\n3. Toss in sliced bell peppers and onions; stir-fry 5-7 minutes.\n4. Add chili sauce and soy sauce; cook another 3 minutes.\n5. Serve hot over rice or noodles.",
            "beef");
    Recipe lemonHerbBakedFish = new MeatRecipe(
            "Lemon Herb Baked Fish",
            0,
            2,
            250,
            20,
            new String[]{"White fish fillets", "Lemon juice", "Garlic", "Parsley", "Olive oil", "Salt", "Pepper"},
            "1. Preheat oven to 180°C (350°F).\n2. Place fish fillets on a baking tray and drizzle with olive oil and lemon juice.\n3. Sprinkle minced garlic, chopped parsley, salt, and pepper over the fish.\n4. Bake for 12-15 minutes, or until fish is cooked through.\n5. Serve with steamed vegetables or a side salad.",
            "white fish");
    Recipe creamyGarlicButterChicken = new MeatRecipe(
            "Creamy Garlic Butter Chicken",
            0,
            4,
            900,
            35,
            new String[]{"Chicken thighs", "Garlic", "Butter", "Heavy cream", "Parmesan cheese", "Parsley", "Olive oil"},
            "1. Season chicken thighs with salt and pepper.\n2. Sear chicken in olive oil until golden brown on both sides.\n3. Remove chicken and sauté minced garlic in butter.\n4. Add heavy cream and Parmesan cheese, stirring until smooth.\n5. Return chicken to the pan and simmer until cooked through.\n6. Garnish with parsley and serve with mashed potatoes or bread.",
            "chicken");


    //generate recipe based on user preferences
    public Recipe generateRecipe(String[] preferences) {
        String veg = preferences[0];
        String spicy = preferences[1];
        String lowCal = preferences[2];

        if (veg.charAt(0) == 'y' && spicy.charAt(0) == 'y' && lowCal.charAt(0) == 'y') {
            return spicyVegStirFry;
        } else if (veg.charAt(0) == 'y' && spicy.charAt(0) == 'y') {
            return fieryChickpeaVegCurry;
        } else if (veg.charAt(0) == 'y' && lowCal.charAt(0) == 'y') {
            return lightVeggieQuinoaBowl;
        } else if (veg.charAt(0) == 'y') {
            return creamyMushroomAndSpinachPasta;
        } else if (spicy.charAt(0) == 'y' && lowCal.charAt(0) == 'y') {
            return spicyGrilledChickenSalad;
        } else if (spicy.charAt(0) == 'y') {
            return fieryBeefAndPepperStirFry;
        } else if (lowCal.charAt(0) == 'y') {
            return lemonHerbBakedFish;
        } else {
            return creamyGarlicButterChicken;
        }
    }

    //generate random recipe from list of recipes
    public Recipe getRandomRecipe() {
        Recipe[] everyRecipe = {
                spicyVegStirFry,
                fieryChickpeaVegCurry,
                lightVeggieQuinoaBowl,
                creamyMushroomAndSpinachPasta,
                spicyGrilledChickenSalad,
                fieryBeefAndPepperStirFry,
                lemonHerbBakedFish,
                creamyGarlicButterChicken
        };
        return everyRecipe[(int)(Math.random() * everyRecipe.length)];
    }

    public void displayRandomRecipe(Recipe originalRecipe){
        String response;
        System.out.println("Would you like a bonus random recipe? (yes/no)");

        while(true) {
            response = scanner.nextLine().toLowerCase();

            if (response.charAt(0) == 'y'){
                Recipe randomRecipe;

                // do while loop to ensure the random recipe isn't the same as the recipe before
                do {
                    randomRecipe = getRandomRecipe();
                } while (randomRecipe.equals(originalRecipe));
                randomRecipe.displayRecipe();
                break;
            } else if (response.charAt(0) == 'n'){
                System.out.println("No Problem. Happy Cooking!\uD83D\uDC4B");
                break;
            } else {
                System.out.print("Invalid input. Please enter 'yes' or 'no': ");
            }
        }
    }
}