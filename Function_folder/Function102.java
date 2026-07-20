import java.util.Scanner;

public class Function102 {

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String str) {

        if (str == null || str.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {

            int len1 = expandFromCenter(str, i, i);       // Odd length palindrome
            int len2 = expandFromCenter(str, i, i + 1);   // Even length palindrome

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    // Helper function to expand around center
    public static int expandFromCenter(String str, int left, int right) {

        while (left >= 0 && right < str.length()
                && str.charAt(left) == str.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = longestPalindrome(str);

        System.out.println("Longest Palindromic Substring = " + result);

        sc.close();
    }
}