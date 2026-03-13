import java.util.*;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half including middle
        for (int i = n; i >= 1; i--) {
            
            // spaces
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }

            // increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // decreasing
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 2; i <= n; i++) {
            
            // spaces
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }

            // increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // decreasing
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}