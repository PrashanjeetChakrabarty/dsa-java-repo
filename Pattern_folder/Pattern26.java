import java.util.*;

// Pattern Name: Wave Matrix Pattern
//
// 1   8   9   16
// 2   7   10  15
// 3   6   11  14
// 4   5   12  13

public class Pattern26{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int num = 1;

        for(int j = 0; j < n; j++) {

            if(j % 2 == 0) {
                // top to bottom
                for(int i = 0; i < n; i++) {
                    arr[i][j] = num++;
                }
            } else {
                // bottom to top
                for(int i = n - 1; i >= 0; i--) {
                    arr[i][j] = num++;
                }
            }
        }

        // print matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}