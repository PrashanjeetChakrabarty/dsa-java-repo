import java.util.Scanner;

public class Function79 {

    public static String reverseWords(String sentence) {

        String words[] = sentence.split(" ");

        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {

            reverse += words[i];

            if (i != 0) {
                reverse += " ";
            }
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = reverseWords(sentence);

        System.out.println("Reversed Sentence: " + result);

        sc.close();
    }
}