import java.util.Scanner;

public class Function48 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        int sum = 0;

        // Input matrix
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Sum of diagonal elements
        for (int i = 0; i < n; i++) {

            sum += matrix[i][i];
        }

        // Display result
        System.out.println("Sum of diagonal elements = " + sum);

        sc.close();
    }
}