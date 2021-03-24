import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        // USER-DEFINED BOX
        // 1. Collect the following from a user: rows, columns, box character, border character.
        Scanner console = new Scanner(System.in);

        System.out.print("Enter rows:");
        int rows = Integer.parseInt(console.nextLine());

        System.out.print("Enter rows:");
        int columns = Integer.parseInt(console.nextLine());

        System.out.println("Enter box character");
        String box = console.next();

        System.out.println("Enter boarder character");
        String boarder = console.next();

        // 2. Use nested loops to print a user-defined box in the console.
        // (See Exercise16.)

//        int rows = 6;
//        int columns = 4;
        int i;
        int j;

        for (i = 1; i <= rows; i++) {

            //this inner loop runs its course (completely) for EACH TIME the outer loop runs.
            for (j = 1; j <= columns; j++) {
                if (j == 1 || j == columns || i == 1 || i == rows) {
                    System.out.print(boarder);
                } else
                    System.out.print(box);
            }
            System.out.println();
        }


    }
}
