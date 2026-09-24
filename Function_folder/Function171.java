import java.util.*;

public class Function171 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean areStructurallySimilar(Node root1, Node root2) {

        // Both nodes are null
        if (root1 == null && root2 == null) {
            return true;
        }

        // One is null and the other is not
        if (root1 == null || root2 == null) {
            return false;
        }

        // Compare only the structure
        return areStructurallySimilar(root1.left, root2.left)
                && areStructurallySimilar(root1.right, root2.right);
    }

    public static void main(String[] args) {

        /*
            Tree 1:

                    1
                   / \
                  2   3
                 /
                4
        */

        Node root1 = new Node(1);

        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);


        /*
            Tree 2:

                   10
                  /  \
                 20   30
                /
               40
        */

        Node root2 = new Node(10);

        root2.left = new Node(20);
        root2.right = new Node(30);
        root2.left.left = new Node(40);


        if (areStructurallySimilar(root1, root2)) {
            System.out.println("Trees are Structurally Similar.");
        } else {
            System.out.println("Trees are Not Structurally Similar.");
        }
    }
}