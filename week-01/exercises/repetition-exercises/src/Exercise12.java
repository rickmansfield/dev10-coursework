import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = console.nextLine();

        // 1. Write a loop to determine if the letter `x` occurs in a user-entered phrase.
        // 2. Print a message for both finding and not finding the `x`.
        char letter = 'x';
        String result = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == letter){
                result = "X found at " + i;
                break;
            } else {
                result = "No \"x\'s\" found";
            }
        }
        System.out.println(result);
    }
}
