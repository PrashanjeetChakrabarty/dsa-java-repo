import java.util.*;

// Pattern Name: Snake Number Triangle
//
// 1
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

public class Pattern23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Store starting value of each column
        int[] start = new int[n + 1];
        start[1] = 1;

        for(int col = 2; col <= n; col++){
            start[col] = start[col - 1] + (n - (col - 2));
        }

        // Print pattern
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(start[j] + (i - j) + " ");
            }
            System.out.println();
        }
    }
}