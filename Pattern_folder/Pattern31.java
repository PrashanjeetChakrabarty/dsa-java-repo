import java.util.*;

// Pattern Name: X Shape Number Pattern
//
// 1       1
//  2     2
//   3   3
//    4 4
//     5
//    4 4
//   3   3
//  2     2
// 1       1

public class Pattern31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for(int i = 1; i <= n; i++) {

            // leading spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // left number
            System.out.print(i);

            // middle spaces
            int middle = 2 * (n - i) - 1;

            if(middle >= 1) {
                for(int j = 1; j <= middle; j++) {
                    System.out.print(" ");
                }
                // right number
                System.out.print(i);
            }

            System.out.println();
        }

        // Lower half
        for(int i = n - 1; i >= 1; i--) {

            // leading spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // left number
            System.out.print(i);

            // middle spaces
            int middle = 2 * (n - i) - 1;

            if(middle >= 1) {
                for(int j = 1; j <= middle; j++) {
                    System.out.print(" ");
                }
                // right number
                System.out.print(i);
            }

            System.out.println();
        }
    }
}