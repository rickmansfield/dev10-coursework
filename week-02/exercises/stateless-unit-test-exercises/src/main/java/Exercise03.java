import java.util.Locale;

public class Exercise03 {

    // 1. Read the hasAllVowels JavaDocs.
    // 2. Complete the hasAllVowels method.
    // 3. Create tests to fully test hasAllVowels and confirm that it's 100% correct.

    /**
     * Determines if a String contains all English vowels: a, e, i, o, and u.
     * Both uppercase and lowercase vowels are allowed.
     * The `null` value should return false.
     *
     * @param value the string to test
     * @return true if the value contains all 5 vowels, false if it doesn't
     */
    static boolean hasAllVowels(String value) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] phrase = value.toLowerCase().toCharArray();
        if (value == null) {
            return false;
        }

        for (int i = 0; i < vowels.length; i++) {
            int phraseWithVowels = value.indexOf(vowels[i]);
            if (phraseWithVowels == -1) {
                return false;
            }
        }
        return true;
    }
}

