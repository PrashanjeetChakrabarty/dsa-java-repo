import java.util.Scanner;

public class Function98 {

    // Function to compare strings ignoring case
    public static boolean areEqualIgnoreCase(String str1, String str2) {

        return str1.equalsIgnoreCase(str2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areEqualIgnoreCase(str1, str2)) {
            System.out.println("Strings are Equal (Ignoring Case)");
        } else {
            System.out.println("Strings are Not Equal");
        }

        sc.close();
    }
}