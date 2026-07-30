import java.util.*;

public class Function112 {

    static class LFUCache {

        class Node {
            int key, value, freq;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
                this.freq = 1;
            }
        }

        int capacity;
        int minFreq;

        HashMap<Integer, Node> cache;
        HashMap<Integer, LinkedHashSet<Node>> freqMap;

        public LFUCache(int capacity) {

            this.capacity = capacity;

            cache = new HashMap<>();
            freqMap = new HashMap<>();

            minFreq = 0;
        }

        public int get(int key) {

            if (!cache.containsKey(key))
                return -1;

            Node node = cache.get(key);

            updateFrequency(node);

            return node.value;
        }

        public void put(int key, int value) {

            if (capacity == 0)
                return;

            if (cache.containsKey(key)) {

                Node node = cache.get(key);

                node.value = value;

                updateFrequency(node);

                return;
            }

            if (cache.size() == capacity) {

                LinkedHashSet<Node> minList = freqMap.get(minFreq);

                Node removeNode = minList.iterator().next();

                minList.remove(removeNode);

                cache.remove(removeNode.key);
            }

            Node newNode = new Node(key, value);

            cache.put(key, newNode);

            freqMap.putIfAbsent(1, new LinkedHashSet<>());

            freqMap.get(1).add(newNode);

            minFreq = 1;
        }

        private void updateFrequency(Node node) {

            int freq = node.freq;

            freqMap.get(freq).remove(node);

            if (freqMap.get(freq).isEmpty()) {

                freqMap.remove(freq);

                if (minFreq == freq)
                    minFreq++;
            }

            node.freq++;

            freqMap.putIfAbsent(node.freq, new LinkedHashSet<>());

            freqMap.get(node.freq).add(node);
        }
    }

    public static void main(String[] args) {

        LFUCache cache = new LFUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);

        System.out.println(cache.get(1));

        cache.put(3, 30);

        System.out.println(cache.get(2));

        System.out.println(cache.get(3));

        cache.put(4, 40);

        System.out.println(cache.get(1));

        System.out.println(cache.get(3));

        System.out.println(cache.get(4));
    }
}