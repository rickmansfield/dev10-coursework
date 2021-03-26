import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

    @Test
    void surroundWithTags() {
        assertEquals("<b>a</b>", Exercise02.surroundWithTag("a", "b"));
        assertEquals("splendid", Exercise02.surroundWithTag("splendid", null));
        assertEquals("<fact>Cats are mean.</fact>", Exercise02.surroundWithTag("Cats are mean.", "fact"));
        assertEquals("this is just text", Exercise02.surroundWithTag("this is just text", null));
        assertEquals("<span></span>", Exercise02.surroundWithTag(null, "span"));
        assertEquals("splendid", Exercise02.surroundWithTag("splendid", null));
    }
}