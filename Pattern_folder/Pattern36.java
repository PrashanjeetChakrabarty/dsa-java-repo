import java.util.Scanner;

public class Pattern36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                char ch = (char) ('A' + (n - 1 - min));

                System.out.print(ch + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}