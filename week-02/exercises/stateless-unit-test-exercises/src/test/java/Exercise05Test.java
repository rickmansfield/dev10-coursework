import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {

    @Test
    void isWithinFiveOfAHundred(){
        Exercise05 instance = new Exercise05();
        assertEquals(true, Exercise05.isWithinFiveOfAHundred(101));
        assertEquals(false, Exercise05.isWithinFiveOfAHundred(49));
        assertEquals(false, Exercise05.isWithinFiveOfAHundred(90));
        assertEquals(false, Exercise05.isWithinFiveOfAHundred(66));
        assertEquals(true, Exercise05.isWithinFiveOfAHundred(96));
        assertEquals(false, Exercise05.isWithinFiveOfAHundred(350));
        assertEquals(false, Exercise05.isWithinFiveOfAHundred(66));
    }
}