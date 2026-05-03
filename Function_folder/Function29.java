import java.util.Scanner;

public class Function29 {

    public static void checkDuck(int num) {
        String str = String.valueOf(num);

        if (str.contains("0") && str.charAt(0) != '0') {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkDuck(n);
    }
}