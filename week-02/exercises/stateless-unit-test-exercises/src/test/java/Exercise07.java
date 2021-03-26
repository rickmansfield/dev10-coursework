import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise07Test {

    Exercise07 instance = new Exercise07();

    @Test
    void reverse() {
        String[] values = {"I", "Love", "to", "code"};
        String[] expected = {"code", "to", "Love", "I"};
        String[] actual = instance.reverse(values);
        assertArrayEquals(expected, actual);
    }

    @Test
    void reverse2() {
        String[] values = {"I", "have", "done", "it"};
        String[] expected = {"it", "done", "have", "I"};
        String[] actual = instance.reverse(values);
        assertArrayEquals(expected, actual);
    }

}