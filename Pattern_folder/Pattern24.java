import java.util.*;

// Pattern Name: Alternating Zig-Zag Floyd Triangle
//
// 1
// 3 2
// 4 5 6
// 10 9 8 7
// 11 12 13 14 15
// 21 20 19 18 17 16

public class Pattern24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for(int i = 1; i <= n; i++) {

            int start = num;
            int end = num + i - 1;

            if(i % 2 == 0) {
                for(int j = end; j >= start; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for(int j = start; j <= end; j++) {
                    System.out.print(j + " ");
                }
            }

            num += i;
            System.out.println();
        }
    }
}