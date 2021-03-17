import java.util.Scanner;
public class Exercise03 {

    public static void main(String[] args) {
        // 1. Change the code to accept input from the user.
        // Use a Scanner and parse the input with Integer.parseInt.
        Scanner console = new Scanner(System.in);
        System.out.println("enter a value from 10 to 26");
        String value = console.nextLine();
        double number = Double.parseDouble(value);

        if (number >= 10 && number <= 26) {
            System.out.println("Value is in the acceptable range.");
        } else {
            System.out.println("Value out of range, try again");
        }
    }
}
