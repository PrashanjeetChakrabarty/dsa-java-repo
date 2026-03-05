import java.util.Scanner;

// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

public class Main7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");

        double pi = Math.PI;

        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        double circumference = 2 * pi * radius;

        System.out.println("Calculation");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference );
    }
    
}
