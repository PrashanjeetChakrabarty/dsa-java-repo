import java.util.*;

//        Print the Reverse Pattern
//
//        5 5 5 5 5
//         4 4 4 4
//          3 3 3
//           2 2
//            1

public class Pattern14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            
            // Print spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            // Print numbers
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}