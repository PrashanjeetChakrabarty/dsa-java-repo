import java.util.Scanner;

public class Function34 {

    // Recursive function for factorial
    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println("Factorial = " + result);

        sc.close();
    }
}