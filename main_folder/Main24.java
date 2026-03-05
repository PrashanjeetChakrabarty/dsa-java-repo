import java.util.*;

public class Main24{

// QS> Print the table of a number input by the user
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");

        int n = sc.nextInt();

        System.out.println("Even numbers till " + n + ":");

        for(int i = 1; i<=n; i++){
            if ( i % 2 == 0){
                System.out.println(i); 
            }
            

        }

        

    }
}