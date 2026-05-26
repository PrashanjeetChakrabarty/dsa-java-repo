import java.util.Scanner;

public class Function49 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int evenCount = 0;
        int oddCount = 0;

        // Input array
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count even and odd
        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display result
        System.out.println("Even Numbers = " + evenCount);
        System.out.println("Odd Numbers = " + oddCount);

        sc.close();
    }
}