import java.util.Scanner;

public class Function65 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxDiff = arr[1] - arr[0];

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[j] - arr[i] > maxDiff) {
                    maxDiff = arr[j] - arr[i];
                }
            }
        }

        System.out.println("Maximum Difference = " + maxDiff);

        sc.close();
    }
}