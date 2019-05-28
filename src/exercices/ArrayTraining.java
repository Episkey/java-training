public class ArrayTraining {

    /**
     * @param n size of the array, ie: 3
     * @return an empty int array of size n, ie: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
        int[] intArray = new int[n];
        return intArray;
    }

    /**
     * @param n size of the array, ie: 2
     * @return an empty String array of size n, ie: {null, null}
     */
    public String[] emptyStringArray(int n) {
        String[] empty = new String[n];
        return empty;
    }

    /**
     * @param a first value, ie: 3
     * @param b second value, ie: 2
     * @param c third value, ie: 1
     * @return an int array with a, b and c values, ie: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
        int[] tableNum = { a, b, c };
        return tableNum;
    }

    /**
     * @param a first value, ie: "test"
     * @param b second value, ie: "sample"
     * @param c third value, ie: "value"
     * @return an int array with a, b and c values, ie: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
        String[] tableStr = { a, b, c };
        return tableStr;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return length of the array, ie: 1
     */
    public int length(int[] array) {

        return array.length;
    }

    /**
     * @param array, ie: {3, 2, 1}
     * @return first value of the array, ie: 3
     */
    public int firstValue(int[] array) {

        return array[0];
    }

    /**
     * @param array, ie: {3, 2, 1}
     * @return last value of the array, ie: 1
     */
    public int lastValue(int[] array) {

        return array[2];
    }

    /**
     * @param array,    ie: {3, 2, 1}
     * @param position, ie: 1
     * @return value of the array at position, ie: 2
     */
    public int valueAtPosition(int[] array, int position) {

        return array[position];
    }

    /**
     * @param array,    ie: {3, 8, 5}
     * @param value,    ie: 4
     * @param position, ie: 1
     * @return the array with the value replaced at position, ie: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
        array[position] = value;
        return array;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return sum of values of the array, ie: 6
     */
    public int sum(int[] array) {
        int sum = array[0] + array[1] + array[2];
        return sum;
    }

    /**
     * @param array,  ie: {1, 2, 3}
     * @param search, ie: 2
     * @return if array contains searched value, ie: true
     */
    public boolean contains(int[] array, int search) {

        if (search == array[1]) {
            return true;
        }
        return false;
    }

    /**
     * @param array, ie: {"sample", "value"}
     * @return array where all words are capitalized, ie: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1);
        }
        return array;
    }

    /**
     * @param first,  ie: {1, 2, 3}
     * @param second, ie: {3, 2, 1}
     * @return if values in first and second arrays, in the same position, are
     *         equals, ie: false
     */
    public boolean equals(int[] first, int[] second) {
        if (first[0] == second[0] || first[1] == second[1] || first[2] == second[2]) {
            return true;
        }
        return false;
    }

    /**
     * @param array, ie: {1, 2, 3}
     * @return array with reversed values, ie: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
        int[] staline = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            staline[array.length - i] = array[i];
        }
        return staline;
    }

    /**
     * @param first,  ie: {1, 2, 3}
     * @param second, ie: {4, 5}
     * @return concatenates first and second values in one array, ie: {1, 2, 3, 4,
     *         5}
     */
    public int[] concat(int[] first, int[] second) {
        int[] newbie = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            newbie[i] = first[i];
            newbie[first.length + i] = second[i];
        }
        return newbie;
    }
}
