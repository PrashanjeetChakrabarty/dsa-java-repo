import java.util.*;

// *****         Print the Pattern 
// *****
// *****
// *****


// NESTED LOOPS

public class Pattern1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Row");
        int n = sc.nextInt();
        System.out.println("Enter the value of Column");
        int m = sc.nextInt();

        System.out.println("Pattern: ");
        for( int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}