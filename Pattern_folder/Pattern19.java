import java.util.*;

// Pattern Name: Hollow Palindromic Number Pyramid
//
//     1
//    2 2
//   3   3
//  4     4
// 555555555

public class Pattern19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            // spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            if(i == 1){
                System.out.println("1");
            }
            else if(i == n){
                for(int j = 1; j <= 2*n-1; j++){
                    System.out.print(n);
                }
                System.out.println();
            }
            else{
                System.out.print(i);

                // middle spaces
                for(int j = 1; j <= 2*i - 3; j++){
                    System.out.print(" ");
                }

                System.out.println(i);
            }
        }
    }
}