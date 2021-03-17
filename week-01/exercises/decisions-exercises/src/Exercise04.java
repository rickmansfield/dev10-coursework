import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double value = Double.parseDouble(console.nextLine());

        // 1. Change the if condition to detect positive or negative numbers.
        // 2. Change the output messages to match.
        if (value >= 0) {
            System.out.println("Positive numbers work");
        } else {
            System.out.println("Negative numbers work too");
        }
    }
}
