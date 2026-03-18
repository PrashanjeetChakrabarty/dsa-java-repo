import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of rows

        int num = 1;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // numbers / hollow part
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == n || j == 1 || j == i) {
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }

                if (j != i) {
                    System.out.print(" ");
                }

                num++;
            }

            System.out.println();
        }

        sc.close();
    }
}