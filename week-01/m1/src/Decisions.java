public class Decisions {
    public static void main(String[] args) {
        int milesPerHour = 56;
        int speedLimit = 55;
        if (milesPerHour > speedLimit) {
            System.out.println("Easy you are over the speed limit.");
        }
        if (milesPerHour > speedLimit +5) {
            System.out.println("Hmmmm...");
            System.out.println("You get a speeding ticket");
            int expensiveTicketThreshold = speedLimit +15;
            if (milesPerHour > expensiveTicketThreshold) {
                System.out.println("Worse, you get an expensive ticket.");
                System.out.println("Better luck next time");
            }
        }
    }
}
