import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        // 1. Collect a phrase from a user via the console.
        // 2. Count the number of digits in the phrase.
        // Hint: Character.isDigit
        // 3. Print the result.
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a phrase");
        String phrase = console.nextLine();

        int sum = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isDigit(phrase.charAt(i))) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }

}
