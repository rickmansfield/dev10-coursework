import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        // SWITCH HOMEWORK
        Scanner console = new Scanner(System.in);

        System.out.print("Hours of homework: ");
        int hoursOfHomework = Integer.parseInt(console.nextLine());

        System.out.println("Day of the week [1-7]: ");
        int dayOfWeek = Integer.parseInt(console.nextLine());

        // 1. Re-implement Exercise07 using a switch statement.
        // Days 6 and 7 represent Saturday and Sunday.
        // If it's the weekend and Abdi has less than 15 hours of homework, he skips homework for the day.
        // For all other days, or if he has more than 15 hours of homework, he does his homework.
        // ---
        // You may choose to track data -- maybe a boolean for homework yes/no -- instead of printing a message in
        // each case. That's a lot of repeated typing.
        // Then print the detailed message after the switch.

        switch (dayOfWeek) {
            case 1:
                System.out.println("Time to do the homework...");
                break;
            case 2:
                System.out.println("Time to do the homework...");
                break;
            case 3:
                System.out.println("Time to do the homework...");
                break;
            case 4:
                System.out.println("Time to do the homework...");
                break;
            case 5:
                System.out.println("Time to do the homework...");
                break;
            case 6:
                if (hoursOfHomework > 15) {
                    boolean homework = true;
                    String message = "Time to do the homework...";
                } else {
                    boolean homework = false;
                    String message = "I'm taking the day off";
                }
                break;
            case 7:
                if (hoursOfHomework < 15) {
                    boolean homework = true;
                    String message = "I'm taking the day off";
                } else {
                    boolean homework = false;
                    String message = "Time to do the homework...";
                }
                break;
            default:
                System.out.println("Error day of week choice");
        }


    }
}
