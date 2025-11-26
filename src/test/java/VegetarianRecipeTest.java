import org.junit.jupiter.api.Test;
import recipegenerator.VegetarianRecipe;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VegetarianRecipeTest {
    @Test
    void testVegetarianRecipeField(){
        VegetarianRecipe myVegetarianRecipe = new VegetarianRecipe("My veg dish", 1,2,200,20, new String[]{"Carrot"}, "Cook it", true);
        assertTrue(myVegetarianRecipe.isVeggie());
        System.out.println("It is " + myVegetarianRecipe.isVeggie() + " that " + myVegetarianRecipe.getName() + " is veggie!");
    }
}