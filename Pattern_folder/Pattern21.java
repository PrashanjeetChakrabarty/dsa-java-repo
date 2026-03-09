import java.util.*;

// Pattern Name: Concentric Number Square

//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

public class Pattern21 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = 2*n - 1;

        for(int i = 0; i < size; i++){

            for(int j = 0; j < size; j++){

                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(n - min + " ");
            }

            System.out.println();
        }
    }
}