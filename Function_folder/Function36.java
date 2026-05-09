import java.util.Scanner;

public class Function36 {

    // Function to reverse string
    public static String reverseString(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = reverseString(text);

        System.out.println("Reversed String: " + result);

        sc.close();
    }
}