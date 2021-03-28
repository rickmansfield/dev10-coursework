import java.util.Scanner;

public class Exercise12 {

    // 1. Create a method.
    // Name: readRequiredString
    // Inputs: String
    // Output: String
    // Description: prompts a user to enter a required string and returns their validated input.
    // The parameter is the message displayed to the user.
    // See the readRequiredString implementation in the methods lesson.
    // You can definitely improve it. Make sure you don't allow blank input. Checking the length() is not enough.

    // 2. Create a method.
    // Name: printNounPhrase
    // Inputs: none
    // Output: none
    // Description: prints an adjective + noun phrase to the console based on user input.
    // Internally, prompts a user for an adjective and a noun with readRequiredString.
    // Concatenates adjective and noun and prints it to the console.

    public static void main(String[] args) {
        // 3. Uncomment the code below and confirm it works.
         printNounPhrase();
         printNounPhrase();
         printNounPhrase();
    }
//Best held in a class rather than an instance of the class
    public static String readRequiredString(String prompt) {
        Scanner console = new Scanner(System.in);
        String result;
        do {
            System.out.println(prompt);
            result = console.nextLine();
        }
        while (result.length() == 0 || result.equals(" ") || result.isBlank());
        return result;

    }
//might be good for an "instance" of a class
    public static void printNounPhrase(){
        String noun = readRequiredString("Enter a noun: ");
        String adjective = readRequiredString("Enter an adjective: ");
       System.out.println("If you answered correctly " + adjective + " is an adjective that describes the noun " + noun + ".");
    }
}
