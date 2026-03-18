import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of rows
        int num = 1;

        for (int i = 1; i <= n; i++) {

            // First half (increasing)
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Second half (mirror decreasing)
            int temp = num - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(temp + " ");
                temp--;
            }

            System.out.println();
        }

        sc.close();
    }
}