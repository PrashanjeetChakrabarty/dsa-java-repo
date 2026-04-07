import java.util.Scanner;

public class Function8 {

    public static void findMaximum(int a, int b) {
        if (a > b) {
            System.out.println("Maximum = " + a);
        } else if (b > a) {
            System.out.println("Maximum = " + b);
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

        findMaximum(a, b);
    }
}