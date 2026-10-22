package medium.ex11_product_except_self;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class ProductExceptSelfTest {
    @Test
    public void testStandard() {
        int[] nums = {1, 2, 3, 4};
        int[] res = ProductExceptSelf.productExceptSelf(nums);
        int[] exp = {24, 12, 8, 6};
        TestRunner.assertEquals(exp.length, res.length);
        for (int i = 0; i < exp.length; i++) {
            TestRunner.assertEquals(exp[i], res[i]);
        }
    }

    @Test
    public void testWithZeroes() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] res = ProductExceptSelf.productExceptSelf(nums);
        int[] exp = {0, 0, 9, 0, 0};
        for (int i = 0; i < exp.length; i++) {
            TestRunner.assertEquals(exp[i], res[i]);
        }
    }
}
