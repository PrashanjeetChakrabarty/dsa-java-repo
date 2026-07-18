import java.util.Arrays;
import java.util.Scanner;

public class Function100 {

    // Function to check if two strings are permutations
    public static boolean arePermutations(String str1, String str2) {

        // If lengths are different, they can't be permutations
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (arePermutations(str1, str2)) {
            System.out.println("The strings are permutations of each other.");
        } else {
            System.out.println("The strings are NOT permutations of each other.");
        }

        sc.close();
    }
}