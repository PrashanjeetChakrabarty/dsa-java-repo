import java.util.*;

public class Pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Inverted Half Pyramid ( Rotated by 180 degree )

//        Print the Pattern

//                *
//               **
//              ***
//             ****
        
        System.out.println("-----------------------------");
        System.out.println("   Enter the value of N :    ");
        System.out.println("-----------------------------");

        int n = sc.nextInt();

        System.out.println("-----------------------------");
        System.out.println("          Pattern :-         ");
        System.out.println("-----------------------------");

        

        System.out.println("-----------------------------");

        for( int i = 1 ; i <= n ; i++){
            for( int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");

            }

            for ( int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



        
    
    }
}