package easy.ex10_fibonacci_dynamic;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class FibonacciTest {
    @Test
    public void testBaseCases() {
        TestRunner.assertEquals(0L, Fibonacci.fib(0));
        TestRunner.assertEquals(1L, Fibonacci.fib(1));
    }

    @Test
    public void testCalculations() {
        TestRunner.assertEquals(1L, Fibonacci.fib(2));
        TestRunner.assertEquals(2L, Fibonacci.fib(3));
        TestRunner.assertEquals(55L, Fibonacci.fib(10));
        TestRunner.assertEquals(7540113804746346429L, Fibonacci.fib(92));
    }

    @Test
    public void testNegativeThrows() {
        try {
            Fibonacci.fib(-1);
            TestRunner.fail("Should throw on negative");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }
    }

    @Test
    public void testOverflowThrows() {
        try {
            Fibonacci.fib(93);
            TestRunner.fail("Should throw on overflow");
        } catch (ArithmeticException e) {
            TestRunner.assertTrue(true);
        }
    }
}
