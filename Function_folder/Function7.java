import java.util.Scanner;

public class Function7 {

    public static void cubeOfNumber(int num) {
        int cube = num * num * num;
        System.out.println("Cube = " + cube);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        cubeOfNumber(n);
    }
}