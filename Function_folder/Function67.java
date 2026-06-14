import java.util.Scanner;

public class Function67 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        // Move non-zero elements to front
        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeroes
        while (index < n) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeroes:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}