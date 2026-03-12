import java.util.*;

// Pattern Name: Spiral Matrix Pattern
//
// 1   2   3   4
// 12 13 14   5
// 11 16 15   6
// 10  9  8   7

public class Pattern25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while(top <= bottom && left <= right) {

            // left to right
            for(int j = left; j <= right; j++) {
                arr[top][j] = num++;
            }
            top++;

            // top to bottom
            for(int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            // right to left
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    arr[bottom][j] = num++;
                }
                bottom--;
            }

            // bottom to top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
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