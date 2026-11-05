public class Function201 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countSingleChildNodes(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        int count = 0;

        // Check if exactly one child exists
        if ((root.left == null && root.right != null) ||
            (root.left != null && root.right == null)) {

            System.out.println(root.data);
            count = 1;
        }

        // Recursively count in left and right subtrees
        count += countSingleChildNodes(root.left);
        count += countSingleChildNodes(root.right);

        return count;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.right.right = new Node(5);

        root.left.left.right = new Node(6);

        System.out.println("Nodes With Only One Child:");

        int result = countSingleChildNodes(root);

        System.out.println("Total Count: " + result);
    }
}