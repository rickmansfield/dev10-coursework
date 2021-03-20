import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // step one display Welcome and prompt for capsules
        int capsuleCount = AdminSetup(console);
        String[] capsules = new String[capsuleCount];

        // step two initialize array capsule hotel with user boundaries & Collect user menu choice
        operateHotel(console, capsules);

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

    //method for the initial hotel creation and loop through switch statement menu choices
    private static void operateHotel(Scanner console, String[] capsules) {
        boolean exitApp = false;
            displayMenu();
            int adminChoice = Integer.parseInt(console.next());

        do {
            switch (adminChoice) {
                case 1: //Check In...see method below
                    CheckIn(console, capsules);
                    break;

                case 2: // Check Out
                    CheckOut(console, capsules);
                    break;

                case 3: // view Guests
                    viewCapsules(console, capsules);
                    break;

                case 4: // Exit
                    //add Exit method here
                    Exit(console);
                    String confirmExit = console.next();
                    if (confirmExit.equals("y")) {
                        exitApp = true;
                        System.out.println("Goodbye!");
                    } else {
                        System.out.println("No worries, let's keep working!");
                    }
                    break;

                default:
                    System.out.println("not valid, try again: ");
            }
            if (!exitApp) {
                displayMenu();
                adminChoice = Integer.parseInt(console.next());
            }
        } while (!exitApp);
    }

    // method for creating/recreating the main menu to display
    private static void displayMenu() {
        System.out.println("\nGuest Menu");
        System.out.println("<==========>");
        System.out.println("1. Check In");
        System.out.println("2. Check  out");
        System.out.println("3. View Guests");
        System.out.println("4. Exit");
        System.out.print("Choose an option [1-4]: ");
    }

    //method for guest check in
    private static void CheckIn(Scanner console, String[] capsules) {
        System.out.println("Guest Check In Menu");
        System.out.println("<=================>");
        System.out.print("Enter Guest Name: ");
        String guestName = console.next();

        boolean checkedIn = false;
        do {
            System.out.print("Enter Capsule #[1- " + capsules.length + "]: ");
            int capsuleNumber = Integer.parseInt(console.next());

            if (capsuleNumber <1 || capsuleNumber > capsules.length) {
                System.out.println("Sorry, that is an invalid capsule, please select between Capsule numbers #[1- " + capsules.length + "]: ");
                continue;
            }

            if (capsules[capsuleNumber -1] == null) {
                capsules[capsuleNumber -1] = guestName;
                System.out.println("\n" + guestName + " is successfully booked in capsule #" + capsuleNumber);
                checkedIn = true;
            } else {
                System.out.println("\nError. Capsule #" + capsuleNumber + " is occupied.");
                //checkedIn = false; //not sure if I have to reaffirm the checked in status.
            }
        } while (!checkedIn);
     }

    //method for guest check out
    private static void CheckOut(Scanner console, String[] capsules) {
        System.out.println("Guest Check Out Menu");
        System.out.println("<=================>");
        System.out.print("Enter Guest Name: ");
        String guestName = console.next();

        boolean checkedOut = false;
        do {
            System.out.print("Enter Capsule #[1- " + capsules.length + "]: ");
            int capsuleNumber = Integer.parseInt(console.next());

            if (capsuleNumber <1 || capsuleNumber > capsules.length) {
                System.out.println("Sorry, that is an invalid capsule, please select between Capsule numbers #[1- " + capsules.length + "]: ");
                continue;
            }

            if (capsules[capsuleNumber -1] == null) {
                System.out.println("\nError. Capsule #" + capsuleNumber + " is not occupied.");
            } else {
                capsules[capsuleNumber -1] = null;
                System.out.println("\n" + guestName + " is successfully checked out from capsule #" + capsuleNumber);
                //what if they enter the wrong name? This version doesn't account for mismatched name.
                checkedOut = true;
            }
        } while (!checkedOut);
    }

    //method for "view"
    private static void viewCapsules(Scanner console, String[] capsules) {
        System.out.println("View Guests");
        System.out.println("<=========>");

        boolean viewComplete = false;
        do {
            System.out.print("Enter number of primary Capsule to view: ");
            int capsuleNumber = Integer.parseInt(console.next());

            if (capsuleNumber <1 || capsuleNumber > capsules.length) {
                System.out.println("Sorry, that is an invalid capsule, please select between Capsule numbers #[1- " + capsules.length + "]: ");
                continue;
            }

            if (capsuleNumber >= 6 && capsuleNumber < capsules.length) {
                for (int i = capsuleNumber -5; i< capsuleNumber +5; i++ ){
                    System.out.printf("Capsule #%s: Guest #%s%n", i + 1, capsules[i] == null ? "[unoccupied]" : capsules[i]);
                    viewComplete = true;
                }
            }

        } while (!viewComplete);
    }

    //method for exit
    private static void Exit(Scanner console){
        System.out.println("Exit");
        System.out.println("<==>");
        System.out.println("Are you Sure? \nAll data will be lost!!");
        System.out.println("Exit [y/n]: ");
    }

}
