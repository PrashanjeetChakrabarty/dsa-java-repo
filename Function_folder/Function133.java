public class Function133 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Check if two trees are identical
    public static boolean isSameTree(Node root1, Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data != root2.data) {
            return false;
        }

        return isSameTree(root1.left, root2.left)
                && isSameTree(root1.right, root2.right);
    }

    // Check whether subRoot exists inside root
    public static boolean isSubtree(Node root, Node subRoot) {

        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {

        /*
                 Main Tree

                    3
                   / \
                  4   5
                 / \
                1   2
        */

        Node root = new Node(3);

        root.left = new Node(4);
        root.right = new Node(5);

        root.left.left = new Node(1);
        root.left.right = new Node(2);

        /*
                 Sub Tree

                    4
                   / \
                  1   2
        */

        Node subRoot = new Node(4);

        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        if (isSubtree(root, subRoot)) {
            System.out.println("Subtree Found");
        } else {
            System.out.println("Subtree Not Found");
        }
    }
}