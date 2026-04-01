package Function_folder;
import java.util.Scanner;

public class Function3 {

    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = square(n);

        System.out.println("Square = " + result);
    }
}