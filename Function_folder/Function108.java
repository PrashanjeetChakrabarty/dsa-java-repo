import java.util.*;

public class Function108 {

    // Function to find minimum intervals to remove
    public static int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length == 0) {
            return 0;
        }

        // Sort by ending time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int remove = 0;
        int end = intervals[0][1];

       