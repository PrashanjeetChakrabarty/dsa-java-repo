import java.util.Scanner;

public class Function84 {

    // Function to compare two strings
    public static boolean areEqual(String str1, String str2) {

        return str1.equals(str2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areEqual(str1, str2)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }

        sc.close();
    }
}