package medium.ex03_longest_substring_without_repeat;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) throw new IllegalArgumentException("Input cannot be null");
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int left = 0, right = 0; right < n; right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c)) {
                left = Math.max(left, lastSeen.get(c) + 1);
            }
            lastSeen.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
