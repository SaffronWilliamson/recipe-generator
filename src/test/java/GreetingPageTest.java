import org.junit.jupiter.api.Test;
import recipegenerator.GreetingPage;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreetingPageTest {
    @Test
    void testGreetingPageShowsTrueWhenUserWantsToContinue() {
        String userInput = "Saffron\nyes\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(userInput.getBytes()));
        boolean result = GreetingPage.showGreetingPage(scanner);
        assertTrue(result);
    }
    @Test
    void testGreetingPageShowsFalseWhenUserDoesNotWantToContinue() {
        String userInput = "Saffron\nno\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(userInput.getBytes()));
        boolean result = GreetingPage.showGreetingPage(scanner);
        assertFalse(result);
    }
}
