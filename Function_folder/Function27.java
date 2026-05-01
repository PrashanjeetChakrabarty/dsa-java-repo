import java.util.Scanner;

public class Function27 {

    public static void checkNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if (sum == num) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkNeon(n);
    }
}