public class Function223 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int findMinimum(Node root) {

        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = findMinimum(root.left);
        int rightMin = findMinimum(root.right);

        return Math.min(root.data,
                Math.min(leftMin, rightMin));
    }

    static int findMaximum(Node root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMaximum(root.left);
        int rightMax = findMaximum(root.right);

        return Math.max(root.data,
                Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(8);

        root.right.right = new Node(30);

        int min = findMinimum(root);
        int max = findMaximum(root);

        int difference = Math.abs(max - min);

        System.out.println("Minimum Node: " + min);
        System.out.println("Maximum Node: " + max);
        System.out.println("Maximum Difference: " + difference);
    }
}