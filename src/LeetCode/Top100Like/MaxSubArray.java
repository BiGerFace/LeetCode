package LeetCode.Top100Like;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 16:25 2019-1-3
 * @Modified By:
 **/
public class MaxSubArray {
    /**
     * Given an integer array nums,find the contiguous subarray(containing at least one number)which has the largest sum
     * and return its sum.
     * 给定一个整数组nums,找到一个具有最大和的连续子数组（子数组最少包含一个数），返回最大和。
     * Example:Input:[-2,1,-3,4,-1,2,1,-5,4]
     * Output:6
     * Explanation:[4,-1,2,1],has the largest sum = 6;
     * Conclue:两两对比，将最大值保存起来
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        // 全局最大
        int max = Integer.MIN_VALUE;
        // 局部最大
        int tempmax = 0;
        for (int i = 0; i < nums.length; i++) {
            tempmax = tempmax + nums[i];
            tempmax = tempmax > nums[i] ? tempmax : nums[i];
            max = max > tempmax ? max : tempmax;
        }
        return max;
    }

    public static void main(String args[]) {
        int[] data = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubArray(data);
        System.out.println(max);
    }
}
