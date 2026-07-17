import java.util.Scanner;

public class Function99 {

    // Function to find most frequent character
    public static void mostFrequentCharacter(String str) {

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character = " + maxChar);
        System.out.println("Frequency = " + maxCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        mostFrequentCharacter(str);

        sc.close();
    }
}