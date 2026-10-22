package easy.ex06_valid_anagram;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        if (s.length() != t.length()) return false;

        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}
