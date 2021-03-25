package learn.testing;

public class ArrayMethods {
    public static int[] shiftLeft(int[] values) {
        //OLD CODE
//        if (values == null) { // account for null
//            return null;
//        }
//
//        if (values.length <= 1) { // nothing to shift
//            return values;
//        }
//
//        int element = values[0];
//        for (int i = 1; i < values.length; i++) {
//            values[i - 1] = values[i];
//        }
//        values[values.length - 1] = element;
//        return values;

        //NEW CODE
        if (values == null) { // account for null
            return null;
        }

        int[] result = new int[values.length];
        if (result.length == 0) { // account for empty array
            return result;
        }

        for (int i = 1; i < values.length; i++) {
            result[i - 1] = values[i];
        }
        result[result.length - 1] = values[0];

        return result;
    }


}
