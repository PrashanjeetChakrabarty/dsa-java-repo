import java.util.Scanner;

public class Function97 {

    // Function to check pangram
    public static boolean isPangram(String str) {

        str = str.toLowerCase();

        boolean alphabet[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {

            if (!alphabet[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        if (isPangram(str)) {
            System.out.println("The string is a Pangram.");
        } else {
            System.out.println("The string is NOT a Pangram.");
        }

        sc.close();
    }
}