import org.junit.jupiter.api.Test;
import recipegenerator.UserInputHandler;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputHandlerTest {

    UserInputHandler userInputHandler = new UserInputHandler(null);

    @Test
    void givenYesToAllPreferencesShouldReturnSpicyLowCalVegRecipe() {
        String[] preferences = {"yes", "yes", "yes"};
        assertEquals("Spicy low cal veg recipe", userInputHandler.generateRecipe(preferences));
    }

    @Test
    void givenNoToAllPreferencesShouldReturnNonSpicyNonLowCalNonVegRecipe() {
        String[] preferences = {"no", "no", "no"};
        assertEquals("non veg, non low cal non spicy recipe", userInputHandler.generateRecipe(preferences));
    }
}
