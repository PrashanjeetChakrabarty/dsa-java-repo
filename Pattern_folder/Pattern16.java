import java.util.*;

//        Pattern Name: Right Shifted Increasing Number Triangle
//
//        Pattern Type: Number Pattern
//
//        Pattern:
//
//        1
//         12
//          123
//           1234
//

public class Pattern16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            // Print spaces
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }

            // Print numbers
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}