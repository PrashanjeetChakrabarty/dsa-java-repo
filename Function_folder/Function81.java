import java.util.Scanner;

public class Function81 {

    // Function to remove spaces
    public static String removeSpaces(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeSpaces(str);

        System.out.println("String after removing spaces:");
        System.out.println(result);

        sc.close();
    }
}