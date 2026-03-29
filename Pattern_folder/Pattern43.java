import java.util.Scanner;

public class Pattern43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            int totalCols = 2 * i - 1;
            int mid = i;

            for (int j = 1; j <= totalCols; j++) {
                if (i == n || j == 1 || j == totalCols || j == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}