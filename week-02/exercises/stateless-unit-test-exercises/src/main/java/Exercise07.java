public class Exercise07 {

    // 1. Read the reverse JavaDocs.
    // 2. Implement reverse.
    // 3. Create tests for reverse and confirm that it is correct.

    /**
     * Reverses the order of elements in an array argument and returns them in a new array.
     * It does not alter the existing array.
     *
     * @param values the array to reverse
     * @return a new array with elements in reverse order.
     */
    public String[] reverse(String[] values) {
        for(int i=0; i<values.length/2; i++){

            String j= values[i];

            values[i] = values[values.length -i -1];

            values[values.length -i -1] = j;

        }
        return values;
    }
}
