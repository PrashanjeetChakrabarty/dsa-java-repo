import java.util.Scanner;

public class Function25 {

    public static void checkAutomorphic(int num) {
        int square = num * num;

        if (square % 10 == num % 10) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkAutomorphic(n);
    }
}