import java.util.*;

public class Function106 {

    // Function to merge intervals
    public static int[][] mergeIntervals(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals based on starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= current[1]) {

                // Overlapping intervals
                current[1] = Math.max(current[1], intervals[i][1]);

            } else {

                merged.add(current);
                current = intervals[i];
            }
        }

        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter start and end of each interval:");

        for (int i = 0; i < n; i++) {

            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[][] result = mergeIntervals(intervals);

        System.out.println("\nMerged Intervals:");

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

        sc.close();
    }
}