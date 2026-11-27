import java.util.Stack;

public class Function226 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int[] findTwoSmallest(Node root) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        Stack<Node> stack = new Stack<>();

        if (root != null) {
            stack.push(root);
        }

        while (!stack.isEmpty()) {

            Node current = stack.pop();
            int value = current.data;

            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            }
            else if (value > smallest && value < secondSmallest) {
                secondSmallest = value;
            }

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(8);

        root.right.right = new Node(30);

        int[] result = findTwoSmallest(root);

        System.out.println("Smallest Value: " + result[0]);

        if (result[1] == Integer.MAX_VALUE) {
            System.out.println("Second Smallest Value: Not Found");
        } else {
            System.out.println("Second Smallest Value: " + result[1]);
        }
    }
}