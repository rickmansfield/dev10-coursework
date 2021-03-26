import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Exercise03Test {

    @Test
    void hasAllVowels() {
        assertTrue(Exercise03.hasAllVowels("aeiou"));
        assertFalse(Exercise03.hasAllVowels("dog"));
        assertFalse(Exercise03.hasAllVowels("fucking great"));

    }
}
