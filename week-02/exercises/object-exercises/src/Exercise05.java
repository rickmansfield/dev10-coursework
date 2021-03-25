import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Musician[] musicians = new Musician[5];
        musicians[0] = new Musician("Frank Ocean", 10);

        // Create musicians from user input. (See Exercise04.)
        System.out.println("Lets Create your top five favorite Musicians");
        boolean end = false;
        do {
            System.out.print("Add another musician?\n\"y\" to continue no to quit \"n\" [y/n]:");
            String response = console.nextLine();

            if (response.equals("y")) {

                Musician m = new Musician();
                System.out.print("Musician name:");
                m.setName(console.nextLine());

                System.out.print("Musician rating [1-5]:");
                int rating = Integer.parseInt(console.nextLine());
                m.setRating(rating);

                // 1. Use a loop to populate the `musicians` array with your top 5 favorite musicians.
                // (Replace Frank Ocean.)
                for (int i = 0; i < musicians.length; i++) {
                    if ((musicians[rating - 1] == null)) {
                        musicians[rating - 1] = m;
                        System.out.println("Excellent " + musicians[rating - 1].getName() + " is now No. " + rating + " on your list");
                    } else {
                        System.out.println("You already have a musician in " + rating + ". Want to replace musician?");
                        String replace = console.nextLine();
                        if (replace.equals("y")) {
                            musicians[rating - 1] = m;
                            System.out.println("Excellent " + musicians[rating - 1].getName() + " is now No. " + rating + " on your list");
                        } else {
                            System.out.println("No Worries musician " + musicians[rating - 1].getName() + " remains " + rating + " on your list.");

                        }
                        // 2. Use a second loop to print details about each musician.
                        for (int j = 0; j < musicians.length; j++) {
                            //System.out.println(musicians[i]);
                            System.out.printf("Your List:%s: %s%n", m.getName(), m.getRating());
                        }
                    }
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

            }
        }
        while (!end);
    }

}


