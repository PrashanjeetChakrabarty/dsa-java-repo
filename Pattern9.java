import java.util.*;

// 0 - 1 Triangle Pattern

//        Print the Pattern

//             1
//             0 1 
//             1 0 1
//             0 1 0 1
//             1 0 1 0 1


public class Pattern9{
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

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        
    }
}
