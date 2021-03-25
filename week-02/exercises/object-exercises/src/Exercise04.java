import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // 1. Add an empty constructor to Musician.
        // 2. Uncomment the code below and make sure it runs.
        // 3. Add a loop. The exercise should ask the user for musicians and print
        // them out until the user types "end".
        boolean end = false;
        do {
            System.out.print("Add another musician?\n\"y\" to continue no to quit \"n\" [y/n]:");
            String response = console.nextLine();

            if (response.equals("y")) {

                Musician m = new Musician();
                System.out.print("Musician name:");
                m.setName(console.nextLine());
                System.out.print("Musician rating:");
                int rating = Integer.parseInt(console.nextLine());
                m.setRating(rating);
                System.out.printf("%s: %s%n", m.getName(), m.getRating());

            }
            if (response.equals("n")) {
                System.out.println("Quit");
                System.out.println("<==>");
                System.out.println("Are you Sure? \nAll data will be lost!!");
                System.out.println("Quit [y/n]: ");
                String confirmExit = console.nextLine();
                if (confirmExit.equals("y")) {
                    end = true;
                    System.out.println("Goodbye!");
                } else {
                    System.out.println("No worries, let's keep working!");
                }

            }

        } while (!end);
    }
}
