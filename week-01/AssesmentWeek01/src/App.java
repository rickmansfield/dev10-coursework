
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // step one display Welcome and prompt for capsules
        int capsuleCount = AdminSetup(console);

        // step two initialize array capsule hotel with user boundaries
        String[] capsules = new String[capsuleCount];

        // step thee call method for user menu choices do/while loop and switch
        operateHotel(console, capsules);
        // create other methods and call them (inside this method) as needed to perform each menu item

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
                    checkIn(console, capsules);
                    break;

                case 2: // Check Out
                    checkOut(console, capsules);
                    break;

                case 3: // view Guests
                    viewCapsules(console, capsules);
                    break;

                case 4: // Exit
                    System.out.println("Exit");
                    System.out.println("<==>");
                    System.out.println("Are you Sure? \nAll data will be lost!!");
                    System.out.println("Exit [y/n]: ");
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
    private static void checkIn(Scanner console, String[] capsules) {
        System.out.println("Guest Check In Menu");
        System.out.println("<=================>");
        System.out.print("Enter Guest Name: ");
        String guestName = console.next();

        boolean checkedIn = false;
        do {
            System.out.print("Enter Capsule #[1- " + capsules.length + "]: ");
            int capsuleNumber = Integer.parseInt(console.next());

            if (capsuleNumber < 1 || capsuleNumber > capsules.length) {
                System.out.println("Sorry, that is an invalid capsule, please select between Capsule numbers #[1- " + capsules.length + "]: ");
                continue;
            }

            if (capsules[capsuleNumber - 1] == null) {
                capsules[capsuleNumber - 1] = guestName;
                System.out.println("\n" + guestName + " is successfully booked in capsule #" + capsuleNumber);
                checkedIn = true;
            } else {
                System.out.println("\nError. Capsule #" + capsuleNumber + " is occupied.");
            }
        } while (!checkedIn);
    }

    //method for guest check out
    private static void checkOut(Scanner console, String[] capsules) {
        System.out.println("Guest Check Out Menu");
        System.out.println("<=================>");

        boolean checkedOut = false;
        do {
            System.out.print("Enter Guest Name: ");
            String guestName = console.next();
            System.out.print("Enter Capsule #[1- " + capsules.length + "]: ");
            int capsuleNumber = Integer.parseInt(console.next());

            if (capsuleNumber < 1 || capsuleNumber > capsules.length) {
                System.out.println("Sorry, that is an invalid capsule, please select between Capsule numbers #[1- " + capsules.length + "]: ");
                continue;
            }
            if (!capsules[capsuleNumber - 1].equals(guestName)) {
                System.out.println("Whoa wrong guest. Retry with correct guest name!");
                continue;
            }

            if (capsules[capsuleNumber - 1] == null) {
                System.out.println("\nError. Capsule #" + capsuleNumber + " is not occupied.");
            } else {
                capsules[capsuleNumber - 1] = null; //resets guest name to null
                System.out.println("\n" + guestName + " is successfully checked out from capsule #" + capsuleNumber);
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

            //Warning to prevent user from selecting out of bounds options
            if (capsuleNumber < 1 || capsuleNumber > capsules.length) {
                System.out.println("Sorry, that is an invalid capsule, please select between Capsule numbers #[1- " + capsules.length + "]: ");
                continue;
            }
            // for Hotels with less than 12 units (i.e. can't view/print five above and below totalling eleven capsules.
            if (capsules.length <= 11) {
                System.out.println("Here are the viewable capsules");
                for (int i = 0; i < capsules.length; i++) {
                    System.out.printf("Capsule #%s: Guest: %s%n", i + 1, capsules[i] == null ? "[unoccupied]" : capsules[i]);
                    viewComplete = true;}
            } else if (capsuleNumber < 6) {
                System.out.println("Here are all the viewable capsules");
                for (int i = capsuleNumber - 1; i < capsuleNumber + 10; i++) {
                    System.out.printf("Capsule #%s: Guest: %s%n", i + 1, capsules[i] == null ? "[unoccupied]" : capsules[i]);
                    viewComplete = true;}
            }

            // for viewing five capsules above/below (total 11) when possible
            if (capsuleNumber >= 6 && capsuleNumber < (capsules.length -4)) {
                System.out.println("Here are the eleven closest capsules");
                for (int i = capsuleNumber - 6; i < capsuleNumber + 5; i++) {
                    System.out.printf("Capsule #%s: Guest: %s%n", i + 1, capsules[i] == null ? "[unoccupied]" : capsules[i]);
                    viewComplete = true;
                }
            }

            // for viewing eleven capsules starting eleven away from the right upper bounds (Alternative to five above/below)
            if (capsuleNumber > 6 && capsuleNumber >= (capsules.length - 4)) {
                System.out.println("Here are the eleven closest capsules");
                for (int i = (capsuleNumber - (11 - (capsules.length - capsuleNumber))); i < capsules.length; i++) {
                    System.out.printf("Capsule #%s: Guest: %s%n", i + 1, capsules[i] == null ? "[unoccupied]" : capsules[i]);
                    viewComplete = true;
                }
            }

        } while (!viewComplete);
    }
}