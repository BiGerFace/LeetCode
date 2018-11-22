package LeetCode.arrayList;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 11:42 2018-11-22
 * @Modified By:
 **/
public class CanJump {
    /**
     * Given an array of non-negative integers, you are initially positioned at the first index of the array.
     * 给定一个非负整数数组，您最初位于数组的第一个索引处。
     * Each element in the array represents your maximum jump length at that position.
     * 数组中的每个元素表示您在该位置的最大跳跃长度。
     * Determine if you are able to reach the last index.
     * 确定是否能够到达最后一个索引。
     * For example:
     * A = [2,3,1,1,4], return true.
     * A = [3,2,1,0,4], return false.
     *
     * @return
     */
    public static boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        // 判断有没有0，没有0肯定能达到
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                break;
            }
            i++;
        }
        // 没有0肯定能达到
        if (i == nums.length) {
            return true;
        }
        i = 0;
        while (i < nums.length) {
            if (i + nums[i] >= nums.length - 1) {
                return true;
            }
            if (nums[i] == 0) {
                return false;
            }
            int max = 0;
            int index = 0;
            // 下一步能前进的最大步骤
            for (int j = i + 1; j - i <= nums[i]; j++) {
                if (max < j - i + nums[j]) {
                    max = j - i + nums[j];
                    index = j;
                }
            }
            // 走到下一步索引
            i = index;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 1, 0, 4};
        boolean result = canJump(data);
        System.out.println(result);

    }
}
