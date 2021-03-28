import java.util.Scanner;

public class Exercise15 {
    /* FIZZ BUZZ

    Historically, the Fizz Buzz (https://en.wikipedia.org/wiki/Fizz_buzz) problem was used in programming interviews.
    Not sure if it still is. Just in case, we'll get it out of the way in Milestone 1.

    Write a program to:
    - Prompt a user for a positive integer and store the result. (Could reuse a readInt method.)
    - Loop from the number 1 to the user's integer.
    - If the number is divisible by 3, print Fizz.
    - If the number is divisible by 5, print Buzz.
    - If the number is divisible by both 3 and 5, print Fizz Buzz.
    - If the number is not divisible by either 3 or 5, print the number.

    Example Output:
    1
    2
    Fizz
    4
    Buzz
    Fizz
    7
    8
    Fizz
    Buzz
    11
    Fizz
    13
    14
    Fizz Buzz
    16
    17
    Fizz
     */

    public static void main(String[] args) {
        int userWholeNumber = 0;

        userWholeNumber = readInt("Enter a whole number: ");
        fizzBuzz(userWholeNumber);


    }

    public static int readInt(String numberPrompt){
        return Integer.parseInt(readString(numberPrompt));
    }

    public static String readString(String prompt) {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);
        return console.nextLine();
    }


    public static void fizzBuzz(int anyWholeNumber){
        for (int i = 1; i <= anyWholeNumber; i++){
            if (i%3==0 && i%5==0) {
            System.out.println(i + " FizzBuzz(by both)");
            }
            else if (i % 3 == 0) {
                System.out.println(i + " Fizz(by3)");
            }
            else if (i % 5 == 0){
                System.out.println(i + " Buzz(by5)");
            }
            else {
                System.out.println(i);
            }
//            System.out.print(","+" ");
        }
    }
}
