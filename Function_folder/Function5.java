import java.util.Scanner;

public class Function5 {

    public static void circumferenceOfCircle(double radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle = " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        circumferenceOfCircle(r);
    }
}