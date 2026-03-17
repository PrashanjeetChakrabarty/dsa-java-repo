import java.util.*;

// Pattern Name: Mirror Pascal Triangle
//
//         1
//       1   1
//     1   2   1
//   1   3   3   1
// 1   4   6   4   1

public class Pattern32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            int num = 1;

            // leading spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // pascal values
            for(int j = 0; j <= i; j++) {
                System.out.print(num);

                if(j != i) {
                    System.out.print("   ");
                }

                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}