public class Exercise10 {


    // 1. Add a `main` method.
    public static void main(String[] args) {

        // 3. Call your method in various ways in the main method.
        removeAllWhiteSpaces("remove all white spaces");//removeallwhitespaces
        removeAllWhiteSpaces("Hello to you");// Hellotoyou
        removeAllWhiteSpaces(" 123 ");// 123
        removeAllWhiteSpaces("A B C");// ABC
        removeAllWhiteSpaces("Oh! \n No! \t My special characters!");//
        removeAllWhiteSpaces("alreadyHasNoWhiteSpaces");// ABC

        //Example of using the value
        String newString = removeAllWhiteSpaces("Yaa ") + "hoo";
        System.out.println(newString);

    }

    // 2. Create method that accepts a String and returns that string with all of its whitespace remove.
    public static String removeAllWhiteSpaces(String phrase) {
        String phraseNoWhiteSpaces = phrase.replaceAll("\\s", "");
        System.out.println(phraseNoWhiteSpaces);
        return phraseNoWhiteSpaces;
    }
}



