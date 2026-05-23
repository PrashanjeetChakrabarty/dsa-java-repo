import java.util.Scanner;

public class Function47 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];
        int transpose[][] = new int[cols][rows];

        // Input matrix
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Transpose logic
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transpose matrix
        System.out.println("Transpose Matrix:");

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}