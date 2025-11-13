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

    @Test
    void testProgrammeDisplaysMildOption(){
        String[] ingredients = {"mild ingredients"};
        Recipe mildRecipe = new Recipe(
                "mild recipe", 0, 2, 200, 25, ingredients, "mild recipe instructions"
        );
        mildRecipe.displayRecipe();
    }

    @Test
    void testProgrammeDisplaysOneChilliSpicyOption(){
        String[] ingredients = {"One chilli spicy ingredients"};
        Recipe oneChilliRecipe = new Recipe(
                "One chilli spicy recipe", 1, 2, 200, 25, ingredients, "One chilli spicy recipe instructions"
        );
        oneChilliRecipe.displayRecipe();
    }

    @Test
    void testProgrammeDisplaysTwoChilliSpicyOption(){
        String[] ingredients = {"Two chilli spicy ingredients"};
        Recipe twoChilliRecipe = new Recipe(
                "Two chilli spicy recipe", 2, 2, 200, 25, ingredients, "Two chilli spicy recipe instructions"
        );
        twoChilliRecipe.displayRecipe();
    }

    @Test
    void testProgrammeDisplaysThreeChilliSpicyOption(){
        String[] ingredients = {"Three chilli spicy ingredients"};
        Recipe threeChilliRecipe = new Recipe(
                "Three chilli spicy recipe", 3, 2, 200, 25, ingredients, "Three chilli spicy recipe instructions"
        );
        threeChilliRecipe.displayRecipe();
    }

}

//TODO - link to the ParameterizedTest maybe?? look into this
