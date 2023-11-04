package _04_Searching_With_Streams;

import java.util.Arrays;

public class StreamSearcher {
    /*
     * Use stream methods to return the number of times a string appears
     * in the array of strings.
     *
     * The filter() and count() stream methods may be useful here.
     */
    public long containsCount(String[] strArr, String strToCount) {
    	int count = (int) Arrays.stream(strArr).filter((word)->word.contains(strToCount)).count();
        return count;
    }
}
