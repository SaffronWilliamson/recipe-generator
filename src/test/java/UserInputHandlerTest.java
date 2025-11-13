import org.junit.jupiter.api.Test;
import recipegenerator.Recipe;
import recipegenerator.UserInputHandler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserInputHandlerTest {

    UserInputHandler myUserInputHandler = new UserInputHandler(null);

    @Test
    void givenYesToAllOptionsReturnSpicyVegLowCalRecipe(){
        String[] preferences = {"yes", "yes", "yes"};
        assertEquals("Spicy, Veg Stir-fry", myUserInputHandler.generateRecipe(preferences).getName());
    }

    @Test
    void testFieryChickpeaCurry(){
        String[] preferences = {"yes", "yes", "no"};
        assertEquals("Fiery Chickpea & Veg Curry", myUserInputHandler.generateRecipe(preferences).getName());
    }

    @Test
    void testLightVeggieQuinoaBowl(){
        String[] preferences = {"yes", "no", "yes"};
        assertEquals("Light Veggie Quinoa Bowl", myUserInputHandler.generateRecipe(preferences).getName());
    }

    @Test
    void testCreamyMushroomAndSpinachPasta(){
        String[] preferences = {"yes", "no", "no"};
        assertEquals("Creamy Mushroom & Spinach Pasta", myUserInputHandler.generateRecipe(preferences).getName());
    }

    @Test
    void testSpicyGrilledChickenSalad(){
        String[] preferences = {"no", "yes", "yes"};
        assertEquals("Spicy Grilled Chicken Salad", myUserInputHandler.generateRecipe(preferences).getName());
    }

    @Test
    void testFieryBeefAndPepperStirFry(){
        String[] preferences = {"no", "yes", "no"};
        assertEquals("Fiery Beef & Pepper Stir-fry", myUserInputHandler.generateRecipe(preferences).getName());
    }

    @Test
    void testLemonHerbBakedFish(){
        String[] preferences = {"no", "no", "yes"};
        assertEquals("Lemon Herb Baked Fish", myUserInputHandler.generateRecipe(preferences).getName());
    }

    @Test
    void givenNoToAllOptionsReturnNonSpicyNonVegNonLowCalRecipe(){
        String[] preferences = {"no", "no", "no"};
    assertEquals("Creamy Garlic Butter Chicken", myUserInputHandler.generateRecipe(preferences).getName());
    }

    @Test
    void testRandomRecipeAlwaysReturnsARecipe() {
        UserInputHandler myUserInputHandler = new UserInputHandler(null);
        Recipe recipe = myUserInputHandler.getRandomRecipe();
        assertNotNull(recipe);
        System.out.println(recipe.getName());
    }
}
