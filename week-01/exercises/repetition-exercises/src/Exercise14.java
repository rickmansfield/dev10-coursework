import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        // 1. Collect a phrase from a user via the console.
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a phrase");
        String phrase = console.nextLine();

        // 2. Count the number of digits in the phrase.
        // Hint: Character.isDigit
        int sum = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isDigit(phrase.charAt(i))) {
                sum += 1;
            }
        }
        // 3. Print the result.
        System.out.println(sum);
    }

}
