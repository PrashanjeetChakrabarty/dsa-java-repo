

// *****         Print the Pattern 
// *   *
// *   *
// *****


// NESTED LOOPS

// ROWS - outer loop
// COLUMNS - inner loop 

import java.util.*;

public class Pattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Rows : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of Columns : ");
        int m = sc.nextInt();

        System.out.println("Pattern: ");

        for(int i = 1 ; i <= n ; i ++){
            for( int j = 1 ; j <= m ; j++){
                if( i == 1 || i == n || j == 1 || j == m){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
