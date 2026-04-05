import java.util.Scanner;

public class Function6 {

    public static void simpleInterest(double p, double r, double t) {
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        simpleInterest(p, r, t);
    }
}