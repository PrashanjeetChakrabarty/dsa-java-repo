import java.util.*;

public class Function105 {

    // Function to find Top K Frequent Elements
    public static List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(frequencyMap.entrySet());

        List<Integer> result = new ArrayList<>();

        // Extract top K elements
        while (k > 0 && !maxHeap.isEmpty()) {
            result.add(maxHeap.poll().getKey());
            k--;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        List<Integer> result = topKFrequent(nums, k);

        System.out.println("Top " + k + " Frequent Elements:");

        for (int num : result) {
            System.out.println(num);
        }

        sc.close();
    }
}