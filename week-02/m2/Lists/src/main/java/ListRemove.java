import java.util.ArrayList;

public class ListRemove {

    public static void main(String[] args) {

        ArrayList<SoccerPlayer> forwards = getForwards();
        SoccerPlayer rapinoe = getRapinoe();

        forwards.remove(rapinoe); // <-- This doesn't work. witout @override in Object i.e. SoccerPlayer.java

        for (SoccerPlayer player : forwards) {
            System.out.println(player.getLastName());
        }
    }

    static ArrayList<SoccerPlayer> getForwards() {
        ArrayList<SoccerPlayer> forwards = new ArrayList<>();
        forwards.add(new SoccerPlayer(2, "Mallory", "Pugh", "FW"));
        forwards.add(new SoccerPlayer(10, "Carli", "Lloyd", "FW"));
        forwards.add(new SoccerPlayer(13, "Lynn", "Williams", "FW"));
        forwards.add(new SoccerPlayer(15, "Megan", "Rapinoe", "FW")); // <-- Rapinoe
        forwards.add(new SoccerPlayer(17, "Tobin", "Heath", "FW"));
        forwards.add(new SoccerPlayer(22, "Jessica", "McDonald", "FW"));
        forwards.add(new SoccerPlayer(23, "Christen", "Press", "FW"));
        return forwards;
    }

    static SoccerPlayer getRapinoe() {
        return new SoccerPlayer(15, "Megan", "Rapinoe", "FW"); // <-- Rapinoe
    }
}