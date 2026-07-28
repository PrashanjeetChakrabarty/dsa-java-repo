import java.util.*;

public class Function110 {

    // Node class
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    // Function to merge K sorted linked lists
    public static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> minHeap =
                new PriorityQueue<>((a, b) -> a.data - b.data);

        // Add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {

            ListNode smallest = minHeap.poll();

            current.next = smallest;
            current = current.next;

            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummy.next;
    }

    // Function to print linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.data);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Creating sample linked lists

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2, l3};

        ListNode merged = mergeKLists(lists);

        System.out.println("Merged Linked List:");
        printList(merged);
    }
}