import java.util.ArrayList;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {

        SoccerPlayer captain = new SoccerPlayer(10, "Carli", "Lloyd", "FW");
        SoccerPlayer goalKeeper = new SoccerPlayer(1, "Alyssa", "Naeher", "GK");
        System.out.printf("%-2s: %s, %s%n",captain.getNumber(),captain.getLastName(),captain.getPosition());
        System.out.printf("%-2s: %s, %s%n",goalKeeper.getNumber(),goalKeeper.getLastName(),goalKeeper.getPosition());

                //The `E` is replaced by a type.
        //ArrayList<E> identifier = new ArrayList<E>();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<NationalForest> forests = new ArrayList<NationalForest>();
        ArrayList<SoccerPlayer> usa = new ArrayList<SoccerPlayer>();

        //Instantiation (See StandardType class) it was declared as a string
        StandardType one = new StandardType();
        one.value = "this field is always a string";

        StandardType two = new StandardType();
        two.value = "it can only ever be a string";

        StandardType three = new StandardType();
        three.value = "yup, still a string";



        GenericType<String> first = new GenericType<String>();
        first.value = "first's value is a String";

        GenericType<NationalForest> second = new GenericType<NationalForest>();
        // seconds's value is a NationalForest
        second.value = new NationalForest("Angelina", "Florida", 21);

        GenericType<int[]> third = new GenericType<int[]>();
        // Generic types are truly generic. They can use any type.
        // Here, value is an int[].
        third.value = new int[] { 1, 3, 5, 7, 9 };

        // create an ArrayList with a default capacity
        ArrayList<SoccerPlayer> abc = new ArrayList<SoccerPlayer>();
        // create an ArrayList with an explicit capacity
        ArrayList<SoccerPlayer> xyz = new ArrayList<SoccerPlayer>(23);
        // create an ArrayList based on another collection
        //ArrayList<SoccerPlayer> qrs = new ArrayList<SoccerPlayer>(qrs);

        //add
        //To add one element at a time, use the .add method. It appends elements at the end of the list.
        ArrayList<SoccerPlayer> goalKeepers = new ArrayList<>();
        goalKeepers.add(new SoccerPlayer(1, "Alyssa", "Naeher", "GK"));
        goalKeepers.add(new SoccerPlayer(18, "Ashlyn", "Harris", "GK"));
        goalKeepers.add(new SoccerPlayer(21, "Adrianna", "Franch", "GK"));

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        // Primitive types can be used, but they're automatically "boxed"
        // into their wrapper type.
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);

        SoccerPlayer franch = new SoccerPlayer(21, "Adrianna", "Franch", "GK");
        goalKeepers.add(0, franch);
        System.out.println(usa);

        // Add 4 in between 2 and 6, at index 1.
        evenNumbers.add(1, 4);

        ArrayList<SoccerPlayer> defense = new ArrayList<>();
        defense.add(new SoccerPlayer(14, "Emily", "Sonnett", "DF"));//Index 0
        defense.add(new SoccerPlayer(19, "Crystal", "Dunn", "DF"));// index 1
        defense.add(new SoccerPlayer(20, "Casey", "Short", "DF")); // index 2

        ArrayList<SoccerPlayer> players = new ArrayList<>();
        players.addAll(goalKeepers);
        players.addAll(defense);

        ArrayList<Integer> oddNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7));

        defense.add(new SoccerPlayer(4, "Becky", "Sauerbrunn", "DF"));//index 3
        defense.add(new SoccerPlayer(5, "Kelley", "O'Hara", "DF"));// index 4
        defense.add(new SoccerPlayer(7, "Abby", "Dahlkemper", "DF"));//index 5
        defense.add(new SoccerPlayer(11, "Ali", "Krieger", "DF"));// index 6
        defense.add(new SoccerPlayer(12, "Tierna", "Davidson", "DF"));
        defense.add(new SoccerPlayer(14, "Emily", "Sonnett", "DF"));
        defense.add(new SoccerPlayer(19, "Crystal", "Dunn", "DF"));
        defense.add(new SoccerPlayer(20, "Casey", "Short", "DF"));

        SoccerPlayer fifth = defense.get(4); // saves o'Hara at index four to a variable called "fifth"
        System.out.println(fifth.getLastName()); // using data above fifth player or index 4 is O'Hara
        System.out.println(defense.get(6).getLastName()); // prints Krieger to the console

        ArrayList<String> cityAnimals = new ArrayList<>();
        System.out.println(cityAnimals.size()); // prints 0
        cityAnimals.add("Raccoon");
        cityAnimals.add("Possum");
        System.out.println(cityAnimals.size());// prints 2
        cityAnimals.add("Turkey");
        System.out.println(cityAnimals.size());// prints 3
        cityAnimals.add("Red-tailed Hawk");
        System.out.println(cityAnimals.size());// 4

        for (int i = 0; i < defense.size(); i++){
            SoccerPlayer sp=defense.get(i);
            System.out.printf("%s: %s %s, %s%n", sp.getNumber(), sp.getFirstName(), sp.getLastName(), sp.getPosition());
        }

        for(SoccerPlayer sp : defense){
            System.out.printf("%s: %s %s, %s%n", sp.getNumber(), sp.getFirstName(), sp.getLastName(), sp.getPosition());
        }

        String[] colors = { "red", "orange", "yellow", "green", "blue", "purple" };
        for(String c : colors){
            System.out.println(c);
        }

//        for (SoccerPlayer sp : defense) {
//            // this doesn't change anything in the `defense` list
//            // it only affects the current block
//            sp = new SoccerPlayer(18, "Ashlyn", "Harris", "GK");
//            System.out.printf("%s: %s %s, %s%n", sp.getNumber(), sp.getFirstName(), sp.getLastName(), sp.getPosition());
//        }
        ArrayList<SoccerPlayer> forwards = new ArrayList<>();
        forwards.add(new SoccerPlayer(2, "Mallory", "Pugh", "FW"));
        forwards.add(new SoccerPlayer(10, "Carli", "Lloyd", "FW"));
        forwards.add(new SoccerPlayer(13, "Lynn", "Williams", "FW"));
        forwards.add(new SoccerPlayer(15, "Megan", "Rapinoe", "FW"));
        forwards.add(new SoccerPlayer(17, "Tobin", "Heath", "FW"));
        forwards.add(new SoccerPlayer(22, "Jessica", "McDonald", "FW"));
        forwards.add(new SoccerPlayer(23, "Christen", "Press", "FW"));

        System.out.println(forwards.size());

        SoccerPlayer removed = forwards.remove(3);
        System.out.printf("%s: %s, %s%n", removed.getNumber(), removed.getLastName(), removed.getPosition());
        removed = forwards.remove(3);
        System.out.printf("%s: %s, %s%n", removed.getNumber(), removed.getLastName(), removed.getPosition());
        removed = forwards.remove(3);
        System.out.printf("%s: %s, %s%n", removed.getNumber(), removed.getLastName(), removed.getPosition());

        System.out.println(forwards.size());

        // list stores Strings
        ArrayList<String> rivers = new ArrayList<>(
                Arrays.asList("Mississippi", "Amazon", "Nile", "Volga", "Zambezi", "Mekong"));

        rivers.remove("Nile"); // value is a String

        for (String name : rivers) {
            System.out.println(name);
        }


    }

}
