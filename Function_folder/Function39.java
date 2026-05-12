import java.util.Scanner;

public class Function39 {

    // Function to find largest element
    public static int findLargest(int arr[]) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findLargest(arr);

        System.out.println("Largest Element = " + result);

        sc.close();
    }
}