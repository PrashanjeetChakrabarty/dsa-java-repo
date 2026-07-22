import java.util.*;

public class Function104 {

    // Function to group anagrams
    public static List<List<String>> groupAnagrams(String[] words) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        List<List<String>> result = groupAnagrams(words);

        System.out.println("\nGrouped Anagrams:");

        for (List<String> group : result) {
            System.out.println(group);
        }

        sc.close();
    }
}