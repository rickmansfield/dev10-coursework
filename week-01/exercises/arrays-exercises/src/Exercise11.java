import java.util.Arrays;
import java.util.Random;

public class Exercise11 {

    public static void main(String[] args) {
        int[] values = makeRandomArray();

        // 1. Count the number of positive elements in `values`.
        // 2. Create a new int[] to hold the positive elements.
        // (We must count first to know the capacity to allocate.)
        // 3. Loop through `values` a second time. Add positive elements to the new array.
        // 4. Confirm the positive array is properly populated either by debugging or printing its elements.

        int valuesTwo = countelements(makeRandomArray());

        for (int i = 0; i < values.length; i++){
            Random random = new Random();
            values[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(values));

    }

    public static int[] makeRandomArray() {
        Random random = new Random();
        int[] result = new int[random.nextInt(100) + 50];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(1000) - 500;
        }
        return result;
    }

    public static int countelements(int[] randomArray){
        int sumPosElements = 0;
        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] > 0)
                sumPosElements += randomArray[i];
        }
        System.out.println(sumPosElements);
        return sumPosElements;
    }

}
