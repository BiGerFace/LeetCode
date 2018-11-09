package LeetCode;

/**
 * @author: MinZhang
 * @desc: Given a sorted array and a target value,
 * return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 * @date: Created in 15:12 2018-11-9
 * @Modified By:
 **/
public class searchInsert {
    /**
     * Example1: Input: [1,3,5,6], 5
     * Output: 2
     * Example2:             Input: [1,3,5,6], 2
     * Output: 1
     * Example3:             Input: [1,3,5,6], 7
     * Output: 4
     * Example4:             Input: [1, 3, 5, 6], 0
     * Output: 0
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        if (nums == null || nums.length ==0 || target<=nums[0]){
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                index = i;
                break;
            }
            if (nums[i] < target){
                index = i+1;
            }

            if (index > nums.length-1){
                index = nums.length;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int nums[] = {2, 8, 4, 1};
        int target = 7;
        int result = searchInsert(nums, target);
        System.out.println("result:" + result);
    }

}
