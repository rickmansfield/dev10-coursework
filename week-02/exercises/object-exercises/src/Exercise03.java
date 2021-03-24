public class Exercise03 {

    public static void main(String[] args) {

        // 1. Add setters for both the name and rating fields in Musician.

        Musician one = new Musician("Frank Ocean", 10);
        System.out.println(one.getName());

        // 2. Use the appropriate setter to change Musician one's name to your favorite musician.
        // (If Frank Ocean is your favorite musician, choose your second favorite.)
        one.setName("Bod Dillan");

        System.out.println(one.getName());

        // Expected Output
        // Frank Ocean
        // [Your Favorite Musician]
        // self imposed competency test
        Musician sinatra = new Musician("Fran Sinatra", 10);
        Musician billie = new Musician("Billie Holiday", 10);
        String format = "name: %s, rating: %s%n";
        System.out.printf(format, sinatra.getName(), sinatra.getRating());
        System.out.printf(format, billie.getName(), billie.getRating());
    }
}
