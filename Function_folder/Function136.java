import java.util.*;

public class Function136 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to get left side view
    public static List<Integer> leftSideView(Node root) {

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

                // First node of the current level
                if (i == 0) {
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
              /     \
             4       5
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.right.right = new Node(5);

        List<Integer> result = leftSideView(root);

        System.out.println("Left Side View:");

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}