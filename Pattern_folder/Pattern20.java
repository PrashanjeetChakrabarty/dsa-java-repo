import java.util.*;

// Pattern Name: Number Diamond Pattern

public class Pattern20 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // upper pyramid
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            for(int j = i-1; j >= 1; j--){
                System.out.print(j);
            }

            System.out.println();
        }

        // lower pyramid
        for(int i = n-1; i >= 1; i--){

            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            for(int j = i-1; j >= 1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}