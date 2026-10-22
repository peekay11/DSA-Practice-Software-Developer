package easy.ex11_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (!set.add(x)) return true;
        }
        return false;
    }
}
