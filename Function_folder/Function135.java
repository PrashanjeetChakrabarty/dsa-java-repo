import java.util.*;

public class Function135 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to get right side view
    public static List<Integer> rightSideView(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node current = queue.poll();

                // Last node of the current level
                if (i == size - 1) {
                    result.add(current.data);
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
                \   \
                 5   4
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.right = new Node(5);
        root.right.right = new Node(4);

        List<Integer> result = rightSideView(root);

        System.out.println("Right Side View:");

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}