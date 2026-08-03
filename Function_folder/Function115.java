import java.util.Scanner;

public class Function115 {

    // DFS Function
    public static void dfs(char[][] grid, int row, int col) {

        if (row < 0 || col < 0 ||
            row >= grid.length ||
            col >= grid[0].length ||
            grid[row][col] == '0') {

            return;
        }

        // Mark current land as visited
        grid[row][col] = '0';

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }

    // Function to count islands
    public static int numIslands(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {

                    count++;

                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        char[][] grid = new char[rows][cols];

        System.out.println("Enter grid (1 for land, 0 for water):");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                grid[i][j] = sc.next().charAt(0);
            }
        }

        int islands = numIslands(grid);

        System.out.println("Number of Islands = " + islands);

        sc.close();
    }
}