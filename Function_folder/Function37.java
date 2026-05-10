import java.util.Scanner;

public class Function37 {

    // Function to check palindrome string
    public static boolean isPalindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        if (isPalindrome(text)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

        sc.close();
    }
}