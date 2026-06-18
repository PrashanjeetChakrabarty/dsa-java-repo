import java.util.Scanner;

public class Function71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Leaders in the array:");

        int maxFromRight = arr[n - 1];

        System.out.print(maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > maxFromRight) {

                maxFromRight = arr[i];
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}