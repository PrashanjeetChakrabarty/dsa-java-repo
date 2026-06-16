import java.util.Scanner;

public class Function69 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("First Repeated Element = " + arr[i]);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No Repeated Element Found");
        }

        sc.close();
    }
}