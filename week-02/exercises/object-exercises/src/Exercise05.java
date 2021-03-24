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
            System.out.print("Add/replace another musician: \"y\" \ntype \"end\" to quit [y/n]:");
            String response = console.nextLine();

            if (response.equals("y")) {

                Musician m = new Musician();
                System.out.print("Musician name:");
                m.setName(console.nextLine());

                System.out.print("Musician rating:");
                int rating = Integer.parseInt(console.nextLine());
                m.setRating(rating);

                // 1. Use a loop to populate the `musicians` array with your top 5 favorite musicians.
                // (Replace Frank Ocean.)
                for (int i = 0; i < musicians.length; i++) {
                    //if ((musicians[i] == null)) {}
                        musicians[i]= m;
                        System.out.println("Excellent " + musicians[i].getName() + " is now No. " + (i + 1) + " on your list");

                }
                // 2. Use a second loop to print details about each musician.
//                for (int i = 0; i < musicians.length; i++) {
//                    //System.out.println(musicians[i]);
//                    System.out.printf("%s: %s%n", m.getName(), m.getRating());
//                }

            }

            if (response.equals("end")) {
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
