import org.junit.jupiter.api.Test;
import recipegenerator.Recipe;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test
    void testRecipeFields() {
        String[] ingredients = {"ingredient1", "ingredient2"};
        Recipe recipe = new Recipe("Spicy low cal veg recipe", 3, 4, 500, 30, ingredients, "instructions");
        assertEquals("Spicy low cal veg recipe", recipe.getName());
        assertEquals(3, recipe.getSpiceLevel());
        assertEquals(4, recipe.getServes());
        assertEquals(500, recipe.getCalories());
        assertEquals(30, recipe.getCookingTime());
        assertEquals(ingredients, recipe.getIngredients());
        assertEquals("instructions", recipe.getInstructions());
    }
}
