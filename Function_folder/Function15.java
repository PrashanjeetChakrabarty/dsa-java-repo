import java.util.Scanner;

public class Function15 {

    public static void countDigits(int num) {
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of Digits = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        countDigits(n);
    }
}