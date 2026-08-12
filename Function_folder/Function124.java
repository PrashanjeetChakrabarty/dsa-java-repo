public class Function124 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to validate BST
    public static boolean isValidBST(Node root) {

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(Node root, long min, long max) {

        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return validate(root.left, min, root.data)
                && validate(root.right, root.data, max);
    }

    public static void main(String[] args) {

        /*
                 50
                /  \
              30    70
             / \    / \
            20 40  60 80
        */

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        if (isValidBST(root)) {
            System.out.println("Valid Binary Search Tree");
        } else {
            System.out.println("Invalid Binary Search Tree");
        }
    }
}