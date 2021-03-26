public class Exercise09 {

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.
    }

    // 1. Create a method.
    // Name: printBox
    // Inputs: int, int
    // Output: void
    // Description: prints a visual box to the console. The first parameter is the number of rows to print.
    // The second parameter is the number of columns.
    // See repetition Exercise15.

    static void printBox(int columns, int rows){
        for (int i = 0; i < rows; i++) {
            System.out.print("#");
            for (int j = 0; j < columns -1; j++) {
                System.out.print("#");

            }

            System.out.println();
        }
    }

    // Expected Output (5 rows, 5 columns)
    // #####
    // #####
    // #####
    // #####
    // #####

    // (3 rows, 4 columns)
    // ####
    // ####
    // ####
}
