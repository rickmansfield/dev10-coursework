public class Exercise05 {

    // 1. Read the isWithinFiveOfAHundred JavaDocs.
    // 2. Implement isWithinFiveOfAHundred.
    // 3. Create tests for isWithinFiveOfAHundred and confirm that it is correct.

    /**
     * Determines if a value is within 5 of any number evenly divisible by 100.
     * Examples
     * -105 to -95: true
     * -94 to -6: false
     * -5 to 5: true
     * 6 to 94: false
     * 95 to 105: true
     * 106 to 194: false
     * 195 to 205: true
     * 206 to 294: false
     * ...continues in both the positive and negative directions...
     *
     * @param value the number to test
     * @return true if value is within 5 of a number evenly divisible by 100, false if not.
     */
    public static boolean isWithinFiveOfAHundred(int value) {
        int low = value - 5;
        for (int i = 0; i < 10; i++) {
            if (low % 100 == 0) {
                return true;
            }
            low++;
        }

        return false;
    }
}

// Adam's Alternatives
//if the number is 5 lower or 5 higher than input ex 99 and that range contains number/100 = whole number then true
//int[] range = {(value -5), (value -4),(value -3),(value -2),(value -1),value,(value -1),(value +2),(value +3),(value +4),(value +5)};
//for(int i =0; i <range.length; i++){
//        int divisableBy100 = (range[i] % 100);
//        if(divisableBy100 == 0) {
//        return true;
//        }
//        }