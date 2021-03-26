import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        int[] intArray = new int[10];
//
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//        ArrayList<BankAccount>  accounts = new ArrayList<>();

        Dinosaur trex = new Dinosaur();
        trex.setName("T-Rex");
        trex.setCarnivore(true);

        Dinosaur raptor = new Dinosaur();
        trex.setName("Raptor");
        trex.setCarnivore(true);

        ArrayList<Dinosaur> jurassicPark = new ArrayList<>();
        jurassicPark.add(trex);
        jurassicPark.add(raptor);
        jurassicPark.add(new Dinosaur("Stegosaurus", false))

        for(Dinosaur dinosaur : jurassicPark) {
            System.out.println((dinosaur.getName()));
        }

    }
}
