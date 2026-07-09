import java.util.Scanner;

public class Function92 {

    // Function to check if string contains only digits
    public static boolean containsOnlyDigits(String str) {

        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (containsOnlyDigits(str)) {
            System.out.println("String contains only digits.");
        } else {
            System.out.println("String does not contain only digits.");
        }

        sc.close();
    }
}