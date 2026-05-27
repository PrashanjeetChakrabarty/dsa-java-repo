import java.util.Scanner;

public class Function50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[0];

        // Find largest element
        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find second largest
        for (int i = 0; i < n; i++) {

            if (arr