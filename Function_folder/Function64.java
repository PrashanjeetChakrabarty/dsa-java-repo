import java.util.Scanner;

public class Function64 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];

        System.out.println("Enter first array elements:");

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter second array elements:");

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Union Elements:");

        // Print first array
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Print unique elements from second array
        for (int i = 0; i < n2; i++) {

            boolean found = false;

            for (int j = 0; j < n1; j++) {

                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }

        sc.close();
    }
}