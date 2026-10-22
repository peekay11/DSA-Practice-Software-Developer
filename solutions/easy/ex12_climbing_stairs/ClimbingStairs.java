package easy.ex12_climbing_stairs;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev2 = 1;
        int prev1 = 2;
        int total = 0;
        for (int i = 3; i <= n; i++) {
            total = prev1 + prev2;
            prev2 = prev1;
            prev1 = total;
        }
        return total;
    }
}
