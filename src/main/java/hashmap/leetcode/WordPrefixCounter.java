package hashmap.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPrefixCounter {
    public static int countWordsWithPrefix(String[] words, String prefix) {
        // Create a HashMap to store the frequency of each prefix
        Map<String, Integer> prefixCount = new HashMap<>();

        // Iterate through the words list and count the frequency of each prefix
        for (String word : words) {
            if (word.startsWith(prefix)) {
                // Increment the count for the current prefix
                prefixCount.put(prefix, prefixCount.getOrDefault(prefix, 0) + 1);
            }
        }

        // Return the count of words with the given prefix
        return prefixCount.getOrDefault(prefix, 0);
    }

    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String prefix = "at";
        int count = countWordsWithPrefix(words, prefix);
        System.out.println("Count of words with prefix " + prefix + ":"+ count);
    }
}
