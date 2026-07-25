import java.util.*;

public class Function107 {

    // Function to insert a new interval
    public static List<int[]> insertInterval(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        // Add all intervals before the new interval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {

            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);

            i++;
        }

        result.add(newInterval);

        // Add remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result;
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

        int[] newInterval = new int[2];

        System.out.print("Enter new interval (start end): ");
        newInterval[0] = sc.nextInt();
        newInterval[1] = sc.nextInt();

        List<int[]> result = insertInterval(intervals, newInterval);

        System.out.println("\nIntervals after insertion:");

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

        sc.close();
    }
}