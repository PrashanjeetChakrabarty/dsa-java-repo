import java.util.*;

// Pattern Name: Inverted Palindromic Number Pyramid
//
// 543212345
//  4321234
//   32123
//    212
//     1

public class Pattern18{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){

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