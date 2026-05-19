import java.util.Scanner;

public class Function44 {

    // Function for Insertion Sort
    public static void insertionSort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int current = arr[i];
            int j = i - 1;

            // Shift elements
            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    // Function to print array
    public static void printArray(int arr[]) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
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

        insertionSort(arr);

        System.out.println("Sorted Array:");

        printArray(arr);

        sc.close();
    }
}