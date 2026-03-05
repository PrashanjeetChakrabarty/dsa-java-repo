
import java.util.*;

// Pattern Name: Palindromic Number Pyramid

//         1
//        212
//       32123
//      4321234
//     543212345

public class Pattern17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            // spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // decreasing numbers
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }

            // increasing numbers
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}