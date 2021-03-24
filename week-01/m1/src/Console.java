import java.util.Scanner;

public class Console{
    public static void main(String[] args) {
        /*java.util.Scanner console = new java.util.Scanner((System.in));
        System.out.println("enter your name:");
        String name = console.nextLine();
        System.out.println("Your name is: " + name);
        */
        Scanner console = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = console.nextLine();
        System.out.println("Your name is: " + name);

    }
}
