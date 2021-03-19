public class Exercise05 {

    public static void main(String[] args) {
        // 1. Declare an array to hold the names of the world's continents.
        // Do not use array literal notation. Allocate space for 7 continents and then set each value by index.
        // 2. Loop over each element and print it.
        String[] worldsContinents = new String[7];
        worldsContinents [0] = "Asia";
        worldsContinents [1] = "Africa";
        worldsContinents [2] = "North America";
        worldsContinents [3] = "South America";
        worldsContinents [4] = "Europe";
        worldsContinents [5] = "Antarctica";
        worldsContinents [6] = "Australia";
        //System.out.println(worldsContinents[0]); // checks array properly initiated
        for (int i = 0; i < worldsContinents.length; i++) {
            String worldContinentsNames = worldsContinents[i];
            System.out.printf("The element at index %s is %s.%n", i, worldContinentsNames);
        }
    }
}
