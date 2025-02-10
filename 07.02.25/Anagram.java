
import java.util.ArrayList;
import java.util.List;

public class Anagram {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        // Frequency count for string p
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // Sliding window approach
        int[] sCount = new int[26];
        int pLength = p.length();
        for (int i = 0; i < s.length(); i++) {
            // Add the current character to the sliding window
            sCount[s.charAt(i) - 'a']++;

            // When the window size is greater than or equal to p's length, slide the window
            if (i >= pLength) {
                // Remove the character that is sliding out of the window
                sCount[s.charAt(i - pLength) - 'a']--;
            }

            // If the frequency of characters in both sCount and pCount are the same, it is an anagram
            if (i >= pLength - 1 && isEqual(sCount, pCount)) {
                result.add(i - pLength + 1);
            }
        }
        return result;
    }

    // Helper function to check if the frequency count of characters in s and p are the same
    private boolean isEqual(int[] sCount, int[] pCount) {
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != pCount[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram finder = new Anagram();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = finder.findAnagrams(s, p);
        System.out.println(result); // Output: [0, 6]
    }
}

