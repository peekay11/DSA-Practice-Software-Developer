package easy.ex10_fibonacci_dynamic;

public class Fibonacci {
    public static long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n > 92) {
            throw new ArithmeticException("Fibonacci overflows 64-bit long for n > 92");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long prev2 = 0;
        long prev1 = 1;
        long curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}
