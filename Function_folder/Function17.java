import java.util.Scanner;

public class Function17 {

    public static void productOfDigits(int num) {
        int product = 1;

        while (num != 0) {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println("Product of Digits = " + product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        productOfDigits(n);
    }
}