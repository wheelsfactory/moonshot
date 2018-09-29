package cn.wheelsfactory;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, TwoSum.twoSum(nums, 9));
    }
}