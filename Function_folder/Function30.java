import java.util.Scanner;

public class Function30 {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPerfect(n)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect");
        }
        sc.close();
    }
}