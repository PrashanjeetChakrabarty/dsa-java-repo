public class Function225 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int[] findTwoLargest(Node root) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        java.util.Stack<Node> stack = new java.util.Stack<>();

        if (root != null) {
            stack.push(root);
        }

        while (!stack.isEmpty()) {

            Node current = stack.pop();
            int value = current.data;

            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } 
            else if (value < largest && value > secondLargest) {
                secondLargest = value;
            }

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(2);
        root.left.right = new Node(8);

        root.right.right = new Node(30);

        int[] result = findTwoLargest(root);

        System.out.println("Largest Value: " + result[0]);

        if (result[1] == Integer.MIN_VALUE) {
            System.out.println("Second Largest Value: Not Found");
        } else {
            System.out.println("Second Largest Value: " + result[1]);
        }
    }
}