import java.beans.MethodDescriptor;

public class Exercise15 {

    public static void main(String[] args) {
        // BOX
        // 1. Use nested loops to print a box in the console.
        // One loop should represent rows and the other should represent columns.
        int columns = 3;
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            System.out.print("#");
            for (int j = 0; j < columns -1; j++) {
                System.out.print("#");

            }

           System.out.println();
        }
    }

    // 2. Change the row and column limit to change the shape of the box.

    // Expected Output (5X5)
    // #####
    // #####
    // #####
    // #####
    // #####

    // (3X4)
    // ####
    // ####
    // ####
}

