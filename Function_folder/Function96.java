import java.util.Scanner;

public class Function96 {

    // Function to count substring occurrences
    public static int countOccurrences(String str, String sub) {

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {

            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        int result = countOccurrences(str, sub);

        System.out.println("Occurrences = " + result);

        sc.close();
    }
}