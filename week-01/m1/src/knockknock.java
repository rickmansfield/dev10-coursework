import java.util.Scanner;
public class knockknock {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String response;
        String response2;
        String answer;

        do { //ask for whos there
            System.out.println("knock knock! \n");
            response = console.nextLine();
        } while (!response.equalsIgnoreCase("whos there"));
        do {
            System.out.println("boo");
            response2 = console.nextLine();
        } while (!response2.equalsIgnoreCase("boo who"));
        System.out.println("dont cry its just a joke");
    }
}