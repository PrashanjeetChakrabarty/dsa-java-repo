import java.util.*;

// Inverted Half Pyramid Pattern with Stars

//        Print the Pattern

//             12345
//             1234
//             123
//             12
//             1
public class Pattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("   Enter the value of N :    ");
        System.out.println("-----------------------------");

        int n = sc.nextInt();

        System.out.println("-----------------------------");
        System.out.println("          Pattern :-         ");
        System.out.println("-----------------------------");

        

        System.out.println("-----------------------------");

        for( int i = 1 ; i <= n ; i++){
            for( int j = 1 ; j <= n - i + 1 ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
    }
}
