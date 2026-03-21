import java.util.*;

public class Pattern37{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int num = 1;

        // Traverse all diagonals
        for (int d = 0; d <= 2 * (n - 1); d++) {

            // Collect all cells of current diagonal
            ArrayList<int[]> cells = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int j = d - i;
                if (j >= 0 && j < n) {
                    cells.add(new int[]{i, j});
                }
            }

            // Fill in zig-zag manner
            if (d % 2 == 0) {
                // even diagonal -> bottom to top
                for (int k = cells.size() - 1; k >= 0; k--) {
                    int i = cells.get(k)[0];
                    int j = cells.get(k)[1];
                    arr[i][j] = num++;
                }
            } else {
                // odd diagonal -> top to bottom
                for (int k = 0; k < cells.size(); k++) {
                    int i = cells.get(k)[0];
                    int j = cells.get(k)[1];
                    arr[i][j] = num++;
                }
            }
        }

        // Print matrix
        System.out.println("\nZig-Zag Number Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}