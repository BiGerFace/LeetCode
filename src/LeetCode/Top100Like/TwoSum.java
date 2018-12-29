package LeetCode.Top100Like;

import java.util.HashMap;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 14:34 2018-12-29
 * @Modified By:
 **/
public class TwoSum {
    /**
     * Given an array of integers,return indicate of the two numbers such that they add up to a specific target.
     * You may assure that each input would have exactly one solution ,and you may not use the same element twice.
     * 给定一个数组、一个target数，找出数组中和为target的两个数。
     * Conclude:通过for循环两个数组，分别将一个数组中的元素，和另个数组的所有数组比较
     * Example :
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String args[]){
        int[] nums = {2,2,11,15};
        int target = 4;
        int[] result = twoSum(nums,target);
        for (int i = 0; i < result.length; i++) {
           System.out.println(result[i]);
        }

    }
}
