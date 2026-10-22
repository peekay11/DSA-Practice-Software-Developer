package hard.ex03_trapping_rain_water;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class TrappingRainWaterTest {
    @Test
    public void testTrappedWater() {
        int[] h1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TestRunner.assertEquals(6, TrappingRainWater.trap(h1));

        int[] h2 = {4, 2, 0, 3, 2, 5};
        TestRunner.assertEquals(9, TrappingRainWater.trap(h2));
    }

    @Test
    public void testEmptyOrFlat() {
        TestRunner.assertEquals(0, TrappingRainWater.trap(new int[]{1, 2, 3}));
        TestRunner.assertEquals(0, TrappingRainWater.trap(new int[]{}));
        TestRunner.assertEquals(0, TrappingRainWater.trap(null));
    }
}
