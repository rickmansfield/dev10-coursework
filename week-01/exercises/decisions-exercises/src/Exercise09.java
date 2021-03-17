import java.util.Scanner;

//1.Add a class, `Exercise09`, to this project.
public class Exercise09 {

    //2.Add a `main` method.
    public static void main(String[] args) {

        //3.Declare a `Scanner` variable.
        Scanner console = new Scanner(System.in);

        //4. Collect three pieces of data from the user:
        System.out.println("Provide a minimum value");
        String inputMin = console.nextLine();
        double min = Double.parseDouble(inputMin);

        System.out.println("Provide maximum value");
        String inputMax = console.nextLine();
        double max = Double.parseDouble(inputMax);

        System.out.println("Provide an actual value");
        String inputActual = console.nextLine();
        double actual = Double.parseDouble(inputActual);

        //5. Add `if/else` statements to determine if the actual value is between the min and max.
        if (actual >= min && actual <= max) {
            System.out.printf("Your number falls between %s and %s", min, max );
        } else {
            System.out.println("ewwww... you picked a number out of range!");
        }
    }
}
