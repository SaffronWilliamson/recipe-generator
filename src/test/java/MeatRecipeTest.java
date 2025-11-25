import org.junit.jupiter.api.Test;
import recipegenerator.MeatRecipe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeatRecipeTest {
    @Test
    void testMeatRecipeMeatTypeField(){
        MeatRecipe myMeatRecipe = new MeatRecipe("My meat dish", 2,2,500,30, new String[]{"Chicken"}, "Cook it through", "chicken");
        assertEquals("chicken", myMeatRecipe.getMeatType());
    }
}
