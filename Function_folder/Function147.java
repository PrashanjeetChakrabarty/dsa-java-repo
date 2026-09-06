import java.util.*;

public class Function147 {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    static TreeNode sortedListToBST(ListNode head) {

        if (head == null) {
            return null;
        }

        // Only one node
        if (head.next == null) {
            return new TreeNode(head.data);
        }

        // Find middle node using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = null;

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is the middle node

        // Break the list into two halves
        if (previous != null) {
            previous.next = null;
        }

        // Create root from middle node
        TreeNode root = new TreeNode(slow.data);

        // Left half
        root.left = sortedListToBST(head);

        // Right half
        root.right = sortedListToBST(slow.next);

        return root;
    }

    static void preorder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("List is empty.");
            sc.close();
            return;
        }

        ListNode head = null;
        ListNode tail = null;

        System.out.println("Enter sorted linked list:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        TreeNode root = sortedListToBST(head);

        System.out.print("Preorder of Balanced BST: ");
        preorder(root);

        System.out.println();

        System.out.print("Inorder of BST: ");
        inorder(root);

        sc.close();
    }
}