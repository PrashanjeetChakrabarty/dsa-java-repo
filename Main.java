
import java.util.*;
import java.util.function.*;

@FunctionalInterface 
interface Calculator{
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
            Calculator add = (a, b) -> a + b;
            Calculator subtract = (a, b) -> a - b;
            Calculator multiply = (a, b) -> a * b;
            Calculator divide = (a, b) -> a / b;  
            System.out.println("Addition: " + add.calculate(5, 3));
            System.out.println("Subtraction: " + subtract.calculate(5, 3));
            System.out.println("Multiplication: " + multiply.calculate(5, 3));
            System.out.println("Division: " + divide.calculate(5, 3));
        
    }
}
