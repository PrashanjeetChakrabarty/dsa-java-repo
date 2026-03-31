package Function_folder;
import java.util.Scanner;


public class Function2 {

    public static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = cube(n);

        System.out.println("Cube = " + result);
    }
}