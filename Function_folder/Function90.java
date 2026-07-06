import java.util.Scanner;

public class Function90 {

    // Function to check rotation
    public static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isRotation(str1, str2)) {
            System.out.println("Strings are Rotations");
        } else {
            System.out.println("Strings are Not Rotations");
        }

        sc.close();
    }
}