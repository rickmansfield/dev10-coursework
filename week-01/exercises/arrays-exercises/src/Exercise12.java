import java.util.Arrays;
import java.util.Random;

public class Exercise12 {

    public static void main(String[] args) {
        int[] values = makeRandomArray();

        // 1. Count the number of positive and non-positive elements in `values`.
        // 2. Create two new int[]s, one for positive elements and one for non-positive.
        // (We count first to determine the capacity to allocate.)
        // 3. Loop through `values` a second time. If an element is positive, add it to the positive array.
        // If it is non-positive, add it to the non-positive array.
        // 4. Confirm that your secondary arrays are properly populated either by debugging or printing their elements.

        int valuesPos = countPosElements(makeRandomArray());
        int valuesNeg = countPosElements(makeRandomArray());

        for (int i = 0; i < values.length; i++){
            Random random = new Random();
            values[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(values));

        for (int i = 0; i < values.length; i++){
            Random random = new Random();
            values[i] = random.nextInt(500) - 500;
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

    public static int countPosElements(int[] randomArray){
        int sumPosElements = 0;
        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] > 0)
                sumPosElements += randomArray[i];
            //Enhanced for loop alternative
//            for (int j : randomArray) {
//                if (j > 0)
//                    sumPosElements += j;
//            }
        }
        System.out.println(sumPosElements);
        return sumPosElements;
    }

    public static int countNegElements(int[] randomArray){
        int sumNegElements  = 0;
        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] < 0)
                sumNegElements += randomArray[i];
            //Enhanced for loop alternative
//            for (int j : randomArray) {
//                if (j > 0)
//                    sumNegElements += j;
//            }
        }
        System.out.println(sumNegElements );
        return sumNegElements ;
    }

}
