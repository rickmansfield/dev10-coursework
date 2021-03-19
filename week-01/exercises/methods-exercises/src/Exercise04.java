public class Exercise04 {

    public static void main(String[] args) {
        System.out.println(getFirstVowel("magnificent")); // Expected: a
        System.out.println(getFirstVowel("winsome")); // Expected: i
        System.out.println(getFirstVowel("xxx")); // Expected:
        System.out.println(getFirstVowel("rick")); // Expected i

        // 2. Call getFirstVowel at least one more time.
    }

    // getFirstVowel returns the first vowel in a string as a char.
    // 1. Complete getFirstVowel.
    // If no vowel is found, return 0. (As a char, 0 represents the NULL value.)

    public static char getFirstVowel(String message) {
        String vowels = "aeiou";
        String result = "";
        for (int i = 0; i < message.length(); i++) {

            if (vowels.indexOf(message.charAt(i)) < 0) {


            } else if (vowels.indexOf(message.charAt(i)) == 0) {
                return 0;
            }
        }
        //return 0;
    }
}
