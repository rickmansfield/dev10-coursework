public class Exercise02 {

    public static void main(String[] args) {

        // 1. Add a getter for the rating field in Musician.

        Musician ocean = new Musician("Frank Ocean", 10);
        System.out.println(ocean.getName());

        // 2. Uncomment the line below and insure that it compiles and runs.
        System.out.println(ocean.getRating());

        // 3. Instantiate two musicians and assign them to new variables.
        Musician sinatra = new Musician("Fran Sinatra", 10);
        Musician billie = new Musician("Billie Holiday", 10);
        Musician bob = new Musician("Bob Marley", 10);

        // 4. Print each musicians' name and rating on a single line.
        String format = "name: %s, rating: %s%n";
        System.out.printf(format, ocean.getName(), ocean.getRating());
        System.out.printf(format, sinatra.getName(), sinatra.getRating());
        System.out.printf(format, billie.getName(), billie.getRating());
        System.out.printf(format, bob.getName(), bob.getRating());
    }
}
