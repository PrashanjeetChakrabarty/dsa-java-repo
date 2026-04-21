import java.util.Scanner;

public class Function20 {

    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series = ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        fibonacciSeries(n);
    }
}