import java.util.*;

public class Function134 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Serialize tree
    public static void serialize(Node root, StringBuilder result) {

        if (root == null) {
            result.append("#,");
            return;
        }

        result.append(root.data).append(",");

        serialize(root.left, result);
        serialize(root.right, result);
    }

    // Deserialize tree
    public static Node deserialize(String data) {

        String[] values = data.split(",");

        Queue<String> queue = new LinkedList<>();

        for (String value : values) {
            queue.offer(value);
        }

        return buildTree(queue);
    }

    // Rebuild tree recursively
    public static Node buildTree(Queue<String> queue) {

        String value = queue.poll();

        if (value.equals("#")) {
            return null;
        }

        Node root = new Node(Integer.parseInt(value));

        root.left = buildTree(queue);
        root.right = buildTree(queue);

        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
                  / \
                 4   5
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.right.left = new Node(4);
        root.right.right = new Node(5);

        // Serialize
        StringBuilder result = new StringBuilder();

        serialize(root, result);

        String serializedTree = result.toString();

        System.out.println("Serialized Tree:");
        System.out.println(serializedTree);

        // Deserialize
        Node newRoot = deserialize(serializedTree);

        System.out.println("\nInorder after Deserialization:");

        inorder(newRoot);

        System.out.println();
    }
}