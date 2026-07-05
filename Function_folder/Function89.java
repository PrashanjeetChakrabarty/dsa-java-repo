import java.util.Scanner;

public class Function89 {

    // Function to remove duplicate characters
    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeDuplicates(str);

        System.out.println("String after removing duplicates:");
        System.out.println(result);

        sc.close();
    }
}