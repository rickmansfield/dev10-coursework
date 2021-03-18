import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        // SWITCH OPPOSITES
        // Given a word, print its opposite using a switch statement.
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = console.nextLine();
        String opposite = null;

        // 1. Re-implement Exercise08 using a switch statement.
        switch (word.toLowerCase()) {
            case "high":
                System.out.println("low");
                break;
            case "cold":
                System.out.println("hot");
                break;
            case "little":
                System.out.println("big");
                break;
            case "sunny":
                System.out.println("cloudy");
                break;
            default:
                System.out.printf("I don't have a case for %s.%n", word);
        }
    }
}
