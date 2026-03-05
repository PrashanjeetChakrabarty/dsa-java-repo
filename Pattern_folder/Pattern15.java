import java.util.*;

//        Pattern Name :  Right Shifted Number Triangle
//
//
//        Pattern:
//
//        1234
//         234
//          34
//           4
//

public class Pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            // Print spaces
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }

            // Print numbers
            for(int j = i; j <= n; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}