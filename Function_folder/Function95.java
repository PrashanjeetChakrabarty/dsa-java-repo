import java.util.Scanner;

public class Function94 {

    // Function to find longest word
    public static String longestWord(String sentence) {

        String words[] = sentence.split(" ");

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = longestWord(sentence);

        System.out.println("Longest Word = " + result);

        sc.close();
    }
}