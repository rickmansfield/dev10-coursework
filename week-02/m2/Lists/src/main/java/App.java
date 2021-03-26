import java.util.ArrayList;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {

        SoccerPlayer captain = new SoccerPlayer(10, "Carli", "Lloyd", "FW");
        SoccerPlayer goalKeeper = new SoccerPlayer(1, "Alyssa", "Naeher", "GK");
        System.out.printf("%-2s: %s, %s%n",captain.getNumber(),captain.getLastName(),captain.getPosition());
        System.out.printf("%-2s: %s, %s%n",goalKeeper.getNumber(),goalKeeper.getLastName(),goalKeeper.getPosition());

//                /* The `E` is replaced by a type.
//        ArrayList<E> identifier = new ArrayList<E>(); */
//        ArrayList<String> names = new ArrayList<String>();
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        ArrayList<NationalForest> forests = new ArrayList<NationalForest>();
//        ArrayList<SoccerPlayer> usa = new ArrayList<SoccerPlayer>();

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

    }

}
