import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        String input = console.nextLine();
        int value = Integer.parseInt(input);
        // 1. Add an if statement that determines if value is even.
        if (value % 2 == 0) {
            // 2. If it is, print a message.
            String message = "your number is even";
            System.out.println(message);
        } else {
            String message2 = "your numnber is odd";
            System.out.println(message2);
        }


        // Don't worry about bad input. e.g. if the user enters "pppffghht".
    }
}
