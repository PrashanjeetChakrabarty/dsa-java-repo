import java.util.Scanner;

public class Function82 {

    // Function to count words
    public static int countWords(String str) {

        if (str.trim().isEmpty()) {
            return 0;
        }

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        int words = countWords(str);

        System.out.println("Number of Words = " + words);

        sc.close();
    }
}