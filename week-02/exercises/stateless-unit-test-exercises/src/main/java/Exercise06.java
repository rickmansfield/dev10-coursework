public class Exercise06 {

    // 1. Read the capitalizeAll JavaDocs.
    // 2. Implement capitalizeAll.
    // 3. Implement suggestions in Exercise06Test.
    // 4. Confirm implementation correctness by running tests.
    // 5. Stretch Goal: instead of capitalizing the first character of each element, capitalize the first character
    // of each word in each element.

    /**
     * Capitalizes the first character of each element in a String[]
     * and returns the result in a new array.
     * A null argument should return null.
     * An empty array should return a new empty array.
     * Null or empty array elements should be ignored.
     *
     * @param values an array containing elements to capitalize.
     * @return a new String[] with each element capitalized.
     */
    public String[] capitalizeAll(String[] values) {
        String [] answer = new String[values.length];
        if(values == null) {
        return null;
    }
        if(values.length == 0) {
        return answer;
    }
        for(int i = 0; i < values.length; i++) {
        String cWord = values[i].substring(0,1).toUpperCase() + values[i].substring(1);
        answer[i] = cWord;
        }
        return answer;
    }
}
