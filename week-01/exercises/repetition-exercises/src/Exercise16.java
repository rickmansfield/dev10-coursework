public class Exercise16 {

    public static void main(String[] args) {
        // BORDER BOX
        // 1. Use nested loops to print a box in the console with a different character for the border.
        // One loop should represent rows and the other should represent columns.
        // The border character should be different from the internal box character.
        // 2. Change the row and column limit to change the shape of the box.

        // Expected Output (5X5)
        // *****
        // *###*
        // *###*
        // *###*
        // *****

        // (3X4)
        // ****
        // *##*
        // ****

        // (2X2)
        // **
        // **

        int rows = 6;
        int columns = 4;
        int i;
        int j;

        for (i = 1; i <= rows; i++) {
            //System.out.print("*");
            //this inner loop runs its course (completely) for EACH TIME the outer loop runs.
            for (j = 1; j <= columns; j++) {
                if (j == 1 || j == columns || i == 1 || i == rows) {
                    System.out.print("*");
                } else
                    System.out.print("#");
            }
            //System.out.print("*");
            System.out.println();
        }
    }
}
