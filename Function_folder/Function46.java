import java.util.Scanner;

public class Function46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        // Condition for multiplication
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int matrix1[][] = new int[r1][c1];
        int matrix2[][] = new int[r2][c2];
        int result[][] = new int[r1][c2];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");

        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < r2; i++) {

            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < c1; k++) {

                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Result Matrix:");

        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}