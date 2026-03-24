import java.util.*;

public class Pattern39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter odd n: ");
        int n = sc.nextInt();

        int totalCols = 2 * n + 1;   //  width for two crosses
        int leftMid = n / 2;
        int rightStart = n + 1;
        int rightMid = rightStart + n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < totalCols; j++) {

                boolean print = false;

                // LEFT CROSS
                if (j < n) {
                    if (i == j || i + j == n - 1 || j == leftMid) {
                        print = true;
                    }
                }

                // RIGHT CROSS
                if (j > n) {
                    int k = j - (n + 1);   // local index in right half
                    if (i == k || i + k == n - 1 || k == n / 2) {
                        print = true;
                    }
                }

                // CENTER CONNECTION
                if (j == n) {
                    if (i == 0 || i == n - 1) {
                        print = true;
                    }
                }

                if (print) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(" ");
                }

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}