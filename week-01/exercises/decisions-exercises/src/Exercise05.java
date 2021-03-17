import java.util.Scanner;

public class Exercise05 {


    public static void main(String[] args) {
        String secret = "tahini";
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the secret word: ");
        String guess = console.nextLine();
        if (guess.equals(secret)) {
            System.out.println("You\'re correct. The Secret word is \"tahini\".");
        } else {
            System.out.println("That\'s not quite right. Try again.");
        }

        // 1. Add decision statements so that:
        // If the secret word is tahini, print the message:
        //   You're correct. The secret word is "tahini".
        // Otherwise, print:
        //   That's not quite right. Try again.
    }
}
