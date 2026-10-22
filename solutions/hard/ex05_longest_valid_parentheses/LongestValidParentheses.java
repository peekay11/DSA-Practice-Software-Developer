package hard.ex05_longest_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) return 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}
