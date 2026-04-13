import java.util.Scanner;

public class Function12 {

    public static void checkPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkPrime(n);
    }
}