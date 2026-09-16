import java.util.*;

public class Function162 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Result {
        int maxSum;
        ArrayList<Integer> path;

        Result(int maxSum, ArrayList<Integer> path) {
            this.maxSum = maxSum;
            this.path = path;
        }
    }

    static Result findMaximumPath(Node root) {

        if (root == null) {
            return new Result(Integer.MIN_VALUE, new ArrayList<>());
        }

        // Leaf node
        if (root.left == null && root.right == null) {

            ArrayList<Integer> path = new ArrayList<>();
            path.add(root.data);

            return new Result(root.data, path);
        }

        Result left = findMaximumPath(root.left);
        Result right = findMaximumPath(root.right);

        Result best;

        if (left.maxSum > right.maxSum) {
            best = left;
        } else {
            best = right;
        }

        ArrayList<Integer> currentPath = new ArrayList<>();
        currentPath.add(root.data);
        currentPath.addAll(best.path);

        return new Result(
                root.data + best.maxSum,
                currentPath
        );
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

        Result result = findMaximumPath(root);

        System.out.println("Maximum Sum: " + result.maxSum);

        System.out.print("Maximum Sum Path: ");

        for (int i = 0; i < result.path.size(); i++) {

            System.out.print(result.path.get(i));

            if (i < result.path.size() - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }
}