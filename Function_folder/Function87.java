import java.util.Scanner;

public class Function87 {

    // Function to find first repeating character
    public static char firstRepeating(String str) {

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i);
                }
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = firstRepeating(str);

        if (result != '\0') {
            System.out.println("First Repeating Character = " + result);
        } else {
            System.out.println("No Repeating Character Found");
        }

        sc.close();
    }
}