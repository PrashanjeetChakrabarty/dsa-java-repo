import java.util.*;

public class Function109 {

    // Function to find minimum meeting rooms required
    public static int minMeetingRooms(int[][] intervals) {

        if (intervals.length == 0) {
            return 0;
        }

        // Sort meetings by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Min Heap to store end times
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {

            // If the earliest meeting has ended
            if (intervals[i][0] >= minHeap.peek()) {
                minHeap.poll();
            }

            // Allocate current meeting
            minHeap.offer(intervals[i][1]);
        }

        return minHeap.size();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of meetings: ");
        int n = sc.nextInt();

        int[][] meetings = new int[n][2];

        System.out.println("Enter meeting start and end times:");

        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }

        int rooms = minMeetingRooms(meetings);

        System.out.println("Minimum Meeting Rooms Required = " + rooms);

        sc.close();
    }
}