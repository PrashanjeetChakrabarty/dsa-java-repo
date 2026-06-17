import java.util.Arrays;
import java.util.Scanner;

public class Function70 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                currentLength++;
            }
            else if (arr[i] != arr[i - 1]) {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println("Longest Consecutive Sequence Length = " + maxLength);

        sc.close();
    }
}