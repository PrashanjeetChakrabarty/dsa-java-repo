import java.util.Scanner;

public class Function130 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static int diameter = 0;

    // Returns height and calculates diameter
    public static int height(Node root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Path passing through current node
        int currentDiameter = leftHeight + rightHeight;

        diameter = Math.max(diameter, currentDiameter);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int findDiameter(Node root) {

        diameter = 0;

        height(root);

        return diameter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int result = findDiameter(root);

        System.out.println("Diameter of Binary Tree = " + result);

        sc.close();
    }
}