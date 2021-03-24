import java.util.Scanner;

public class game {
    public static void main(String[] args) {

        // Your current location.
        String location = "start";

        // Must find these this item to win.
        boolean hasKey = false;


        // Receive commands.
        Scanner console = new Scanner(System.in);
        String command = null;

        while (!location.equals("done")) {

            switch (location) {
                case "start":
                    System.out.println("You wake up in a strange room, there are three doors around you.");
                    System.out.println("Welcome to our breakout room, we want to be your advocate today. Try to look for hints as you go.");
                    System.out.println("There\'s door locked door to the East.");
                    System.out.println("There\'s a door to the West with a devil on it.");
                    System.out.println("There\'s a door with an angel on it to your North.");
                    System.out.println("Type the name of the image on the door to navigate: example \"angel\" , \"Devil\" , \"lockedDoor\" ");
                    System.out.print("?: ");
                    command = console.nextLine();
                    if (command.equalsIgnoreCase("angel")) {
                        location = "angel";
                    } else if (command.equalsIgnoreCase("devil")) {
                        location = "devil";
                    } else if (command.equalsIgnoreCase("lockedDoor")) {
                        if (!hasKey) {
                            location = "lockedDoor";
                        } else {
                            System.out.println("You need a key to open this door");
                            location = "start"; } //if they have key door unlocks
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    break;
                case "angel":
                    System.out.println("Bad choice the hint was \"Devils advocate\".");
                    System.out.println("Your are in the North wing.");
                    System.out.println("The door locks behind you");
                    System.out.println("The angel of death sets the room on fire.");
                    System.out.println("Game Over!");
                    location = "start";
                    break;
                case "devil":
                    System.out.println("Good choice the hint was Devils advocate.");
                    System.out.println("The door locks behind you");
                    System.out.println("Now you see a dragon door, and an elf door");
                    System.out.println("Your journey is short.");

                    command = console.nextLine();

                    if (command.equalsIgnoreCase("dragon")) {
                        location = "angel";
                    } else if (command.equalsIgnoreCase("elf")) {
                        location = "elf";
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    break;

                case "lockedDoor":
                    System.out.println("Victor! You win");
                    location = "start";
                    break;

                case "elf":
                    System.out.println("Good choice, you passed safely to this room.");
                    System.out.println("The door locks behind you.");
                    System.out.println("You see two final doors in front of you,\n one labeled One and the other Zero");
                    System.out.println("Life is binary.");
                    System.out.print("?: ");
                    command = console.nextLine();

                    if (command.equalsIgnoreCase("zero")) {
                        location = "angel";
                    } else if (command.equalsIgnoreCase("one")) {
                        location = "one";
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    break;

                case "one":
                    System.out.println("You enter the final room and see a key hanging from the ceiling.");
                    System.out.println("Do you take it Yes/No: ");

                    command = console.nextLine();

                    if (command.equalsIgnoreCase("yes")) {
                        hasKey = true;
                        System.out.println("You got the master-key for the all the doors. You win!");
                        location = "start";
                    } else if (command.equalsIgnoreCase("no")) {
                        System.out.println("But why? Now you die.");
                        location = "angel";
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    location = "done";
                    break;

                default:
                   // System.out.println("-default bug tool-");
                    location = "start";

            }

        }
    }
}


