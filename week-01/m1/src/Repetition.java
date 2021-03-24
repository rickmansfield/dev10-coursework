
import java.util.Random;
public class Repetition {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 1;
        int b = 2;
        int c = 3;

        while (a < 50 || b % 2 == 0 && c % 3 != 0) {

            System.out.printf("%s,%s,%s%n", a, b, c);

            a = rand.nextInt(100);
            b = rand.nextInt(100);
            c = rand.nextInt(100);
        }

    }
}
