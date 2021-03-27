public class Exercise04 {

    public static void main(String[] args) {
        System.out.println(getFirstVowel("magnificent")); // Expected: a
        System.out.println(getFirstVowel("winsome")); // Expected: i
        System.out.println(getFirstVowel("xxx")); // Expected: " " an empty space
        System.out.println(getFirstVowel("super man")); // Expected u

        // 2. Call getFirstVowel at least one more time.
    }

    // getFirstVowel returns the first vowel in a string as a char.
    // 1. Complete getFirstVowel.
    // If no vowel is found, return 0. (As a char, 0 represents the NULL value.)

    public static char getFirstVowel(String message) {
        String vowels = "aeiou";
        char result = 0;
        for (int i = 0; i < message.length(); i++) {
            if (vowels.indexOf(message.charAt(i)) >= 0) {
                result = message.charAt(i);
                break;
            } else
                result = 0;
        }
        return result;
    }
}
