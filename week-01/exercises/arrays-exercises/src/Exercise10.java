import java.util.Arrays;
import java.util.Random;

public class Exercise10 {

    public static void main(String[] args) {
        String[] bugs = makeBugArray();

        // The bugs array elements are either the value "beetle" or "mosquito".
        // 1. Count the number of beetles and mosquitoes.
        // 2. Print the result.
        // Results will vary because of randomness.
        int sumBeetles = 0;
        int sumMosquito = 0;
        for (String bug : bugs) {
            if (bug.equals("beetle")) {
                sumBeetles += 1;
            }
            if (bug.equals("mosquito")) {
                sumMosquito += 1;
            }
        }
        System.out.println("There are " + sumBeetles + " beetles");
        System.out.println("There are " + sumMosquito + " mosquitoes");
    }

    public static String[] makeBugArray() {
        String[] bugs = new String[200];
        Arrays.fill(bugs, "beetle");
        Random random = new Random();
        for (int i = 0; i < random.nextInt(150); i++) {
            bugs[random.nextInt(bugs.length)] = "mosquito";
        }
        return bugs;
    }
}
