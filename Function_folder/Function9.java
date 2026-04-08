import java.util.Scanner;

public class Function9 {

    public static void findMinimum(int a, int b) {
        if (a < b) {
            System.out.println("Minimum = " + a);
        } else if (b < a) {
            System.out.println("Minimum = " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        findMinimum(a, b);
    }
}