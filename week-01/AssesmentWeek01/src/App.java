import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // step one display Welcome and prompt for capsules
        int capsuleCount = AdminSetup(console);
        String[] capsules = new String[capsuleCount];

        // step two initialize capsule hotel with user boundaries
        createHotel(console, capsules);

    }

    //method for the initial set up
    private static int AdminSetup(Scanner console) {
        System.out.println("Welcome to the Capsule Hotel App!");
        System.out.println("<===============================>");
        System.out.print("Please enter the capsules in your hotel: ");

        int capsuleCount = Integer.parseInt(console.next());

        System.out.println("Excellent, you have " + capsuleCount + " available capsules for occupancy.");
        return capsuleCount;
    }

    //method for the initial hotel creation
    private static void createHotel(Scanner console, String[] capsules) {
        boolean exitApp = false;
        DisplayMenu();
    }
    // method for creating/recreating the main menu to display
    private static void DisplayMenu() {
        System.out.println("\nGuest Menu");
        System.out.println("<==========>");
        System.out.println("1. Check In");
        System.out.println("2. Check  out");
        System.out.println("3. View Guests");
        System.out.println("4. Exit");
        System.out.print("Choose an option [1-4]");
    }




}
