import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        // USPS
        // Below is an abbreviated version of the US Postal Service retail parcel rates:
        /*
        Lbs | Zones 1&2 | Zone 3
        ===============
        1      $7.50      $7.85
        2       8.25       8.70
        3       8.70       9.70
        4       9.20      10.55
        5      10.20      11.30
        */

        // 1. Collect the parcel lbs and zone (1, 2, or 3) from the user.
        // 2. Add `if`/`else if`/`else` logic to cover all rates.
        // Use whatever strategy you think is best. You can create compound conditions or nest if/else statements.
        // If a lbs/zone combo does not exist, print a warning message for the user.

        Scanner console = new Scanner(System.in);

        System.out.println("Provide Lbs");
        String inputLbs = console.nextLine();
        double lbs = Double.parseDouble(inputLbs);

        System.out.println("Provide Zone. i.e. 1, 2, 3");
        String inputZone = console.nextLine();
        double zone = Double.parseDouble(inputZone);

        if (zone == 1 || zone == 2 && lbs == 1) {
            System.out.println("Shipping is $7.50");
        } else if (zone == 1 || zone == 2 && lbs == 2) {
            System.out.println("Shipping is $8.25");
        } else if (zone == 1 || zone == 2 && lbs == 3) {
            System.out.println("Shipping is $8.70");
        } else if (zone == 1 || zone == 2 && lbs == 4) {
            System.out.println("Shipping is $9.20");
        } else if (zone == 1 || zone == 2 && lbs == 5) {
            System.out.println("Shipping is $10.20");
        } else if (zone == 3 && lbs == 1) {
            System.out.println("Shipping is $7.85");
        } else if (zone == 3 && lbs == 2) {
            System.out.println("Shipping is $8.70");
        } else if (zone == 3 && lbs == 3) {
            System.out.println("Shipping is $9.70");
        } else if (zone == 3 && lbs == 4) {
            System.out.println("Shipping is $10.55");
        } else if (zone == 3 && lbs == 5) {
            System.out.println("Shipping is $11.30");
        }
    }
}
