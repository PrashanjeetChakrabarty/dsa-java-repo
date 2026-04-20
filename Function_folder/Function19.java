import java.util.Scanner;

public class Function19 {

    public static void findPower(int base, int exponent) {
        int power = 1;

        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }

        System.out.println("Power = " + power);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        findPower(base, exponent);
    }
}