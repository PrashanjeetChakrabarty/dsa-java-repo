public class Main4 {
    // Variables and Data Types
    public static void main(String[] args){
        String name = "Prashanjeet";
        int age = 21;

        name = "PC"; // Reassigning the value of name variable
        age = 22; // Reassigning the value of age variable

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        int a = 10;
        int b = 20;
        int c = 10;
        int d = 5;



        int sum = a + b;
        System.out.println("Sum: " + sum);
        int difference = a - b;
        System.out.println("Difference: " + difference);
        int product = a * b;
        System.out.println("Product: " + product);
        int quotient = b / a;
        System.out.println("Quotient: " + quotient);

        // priority of operators = *, / > +, -

        int ans1 = c*d/c-d;
        System.out.println("Answer 1: " + ans1);
        // Explanation of ans1:
        // Step 1: c*d = 10*5 = 50
        // Step 2: 50/c = 50/10 = 5
        // Step 3: 5-d = 5-5 = 0
        // Final answer = 0


        int ans2 = (c*d)/(c-d);
        System.out.println("Answer 2: " + ans2);
        // Explanation of ans2:
        // Step 1: c*d = 10*5 = 50      
        // Step 2: c-d = 10-5 = 5
        // Step 3: 50/5 = 10
        // Final answer = 10

        




    }
}
