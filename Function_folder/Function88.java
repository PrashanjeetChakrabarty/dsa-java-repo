import java.util.Scanner;

public class Function88 {

    // Function to reverse each word
    public static String reverseEachWord(String sentence) {

        String words[] = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }

            result += reverse;

            if (i != words.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = reverseEachWord(sentence);

        System.out.println("Reversed Words:");
        System.out.println(result);

        sc.close();
    }
}