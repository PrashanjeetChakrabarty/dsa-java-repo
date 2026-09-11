import java.util.*;

public class Function154 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        Node parent;
        int level;

        Info(Node parent, int level) {
            this.parent = parent;
            this.level = level;
        }
    }

    static Info findNode(Node root, int target) {

        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        Queue<Node> parents = new LinkedList<>();
        Queue<Integer> levels = new LinkedList<>();

        queue.add(root);
        parents.add(null);
        levels.add(0);

        while (!queue.isEmpty()) {

            Node current = queue.poll();
            Node parent = parents.poll();
            int level = levels.poll();

            if (current.data == target) {
                return new Info(parent, level);
            }

            if (current.left != null) {
                queue.add(current.left);
                parents.add(current);
                levels.add(level + 1);
            }

            if (current.right != null) {
                queue.add(current.right);
                parents.add(current);
                levels.add(level + 1);
            }
        }

        return null;
    }

    static boolean areCousins(Node root, int x, int y) {

        Info first = findNode(root, x);
        Info second = findNode(root, y);

        // Either node does not exist
        if (first == null || second == null) {
            return false;
        }

        // Same level but different parents
        return first.level == second.level
                && first.parent != second.parent;
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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first node: ");
        int x = sc.nextInt();

        System.out.print("Enter second node: ");
        int y = sc.nextInt();

        if (areCousins(root, x, y)) {
            System.out.println(x + " and " + y + " are Cousins");
        } else {
            System.out.println(x + " and " + y + " are Not Cousins");
        }

        sc.close();
    }
}