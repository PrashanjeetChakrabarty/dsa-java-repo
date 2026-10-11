
import java.util.*;

public class Function187 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void reverseLevelOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node current = queue.poll();

                currentLevel.add(current.data);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            stack.push(currentLevel);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        reverseLevelOrder(root);
    }
}