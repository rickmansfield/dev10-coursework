import java.util.Scanner;

public class Exercise14 {
    /* SHORT SURVEY

    Write a program that asks a user four questions and prints the results:
    - What is your first name?
    - What is your last name?
    - How many towns/cities have you lived in?
    - How many musical instruments can you play?

    Store each answer in a variable with an appropriate type.
    Print the results after the user has answered all four questions.

    Use methods to break the program into reusable blocks of code.
     */
    public static void main(String[] args) {
        printSurveyAnswers();

    }

    public static String readRequiredString(String prompt) {
        Scanner console = new Scanner(System.in);
        String result;
        do {
            System.out.println(prompt);
            result = console.nextLine();
        }
        while (result.length() == 0 || result.equals(" "));
        return result;

    }

    public static void printSurveyAnswers() {
        String firstName = readRequiredString("What is your first name?: ");
        String lastName = readRequiredString("What is your last name?: ");
        int citiesLivedIn = Integer.parseInt(readRequiredString("How many towns/cities have you lived in? "));
        int instrumentsPlayed = Integer.parseInt(readRequiredString("How many musical instruments can you play? "));
        System.out.println("Name: " + firstName + " " + lastName + ".");
        System.out.println("Lived in " + citiesLivedIn + " cities.");
        System.out.println(("Plays " + instrumentsPlayed + " instruments."));
    }
}
