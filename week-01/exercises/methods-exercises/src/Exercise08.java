public class Exercise08 {

    // 1. Create a method.
    // Name: getRandomFruit
    // Inputs: none
    // Output: String
    // Description: returns a random fruit name as a string.
    // See Exercise01.
    // Choose from at least 5 fruits.

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.

        System.out.println(getRandomFruit());

        String firstFruit = getRandomFruit();
        System.out.println(firstFruit);

        String secondFruit = getRandomFruit();
        System.out.println(secondFruit);

        String thirdFruit = getRandomFruit();
        System.out.println(thirdFruit);

    }

    public static String getRandomFruit() {
        switch ((int) (Math.random() *10)) {
            case 0:
                return "Banana";
            case 1:
                return "Oranges";
            case 2:
                return "Apples";
            case 3:
                return "Grapes";
            case 4:
                return "Plums";
            case 5:
                return "Pears";
            default:
                return "Pineapple"; // should never happen
        }
    }
}
