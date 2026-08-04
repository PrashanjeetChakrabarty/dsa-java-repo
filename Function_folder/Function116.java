import java.util.*;

public class Function116 {

    // Graph Node
    static class Node {

        int val;
        List<Node> neighbors;

        Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }
    }

    static HashMap<Node, Node> map = new HashMap<>();

    // DFS function to clone graph
    public static Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        if (map.containsKey(node)) {
            return map.get(node);
        }

        Node clone = new Node(node.val);

        map.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }

    // Print Graph using DFS
    public static void printGraph(Node node, HashSet<Node> visited) {

        if (node == null || visited.contains(node)) {
            return;
        }

        visited.add(node);

        System.out.print("Node " + node.val + " -> ");

        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.val + " ");
        }

        System.out.println();

        for (Node neighbor : node.neighbors) {
            printGraph(neighbor, visited);
        }
    }

    public static void main(String[] args) {

        // Creating graph

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);

        n3.neighbors.add(n2);
        n3.neighbors.add(n4);

        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        Node clonedGraph = cloneGraph(n1);

        System.out.println("Cloned Graph:");

        printGraph(clonedGraph, new HashSet<>());
    }
}