import org.junit.jupiter.api.Test;
import recipegenerator.RecipeGeneratorApp;

import java.io.ByteArrayInputStream;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class RecipeGeneratorAppTest {
    @Test
    void testMainMethodRunsWithoutCrashing(){
        String userInput = "Saffron\n" + "yes\n" + "yes\n" + "yes\n" + "yes\n" + "no\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        assertDoesNotThrow(() -> RecipeGeneratorApp.main(new String[]{}));
    }
}
