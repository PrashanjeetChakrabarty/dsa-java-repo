import java.util.*;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {
            int start = num;

            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                int temp = num + n - 1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(temp + " ");
                    temp--;
                }
                num += n;
            }

            System.out.println();
        }
    }
}