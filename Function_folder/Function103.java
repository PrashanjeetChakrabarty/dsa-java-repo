import java.util.HashMap;
import java.util.Scanner;

public class Function103 {

    // Function to find the minimum window substring
    public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> targetMap = new HashMap<>();

        for (char ch : t.toCharArray()) {
            targetMap.put(ch, targetMap.getOrDefault(ch, 0) + 1);
        }

        int required = targetMap.size();
        int formed = 0;

        HashMap<Character, Integer> windowMap = new HashMap<>();

        int left = 0;
        int right = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            if (targetMap.containsKey(ch) &&
                windowMap.get(ch).intValue() == targetMap.get(ch).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (targetMap.containsKey(leftChar) &&
                    windowMap.get(leftChar) < targetMap.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String s = sc.nextLine();

        System.out.print("Enter the pattern: ");
        String t = sc.nextLine();

        String result = minWindow(s, t);

        if (result.isEmpty()) {
            System.out.println("No valid window found.");
        } else {
            System.out.println("Minimum Window = " + result);
        }

        sc.close();
    }
}