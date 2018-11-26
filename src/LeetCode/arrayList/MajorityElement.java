package LeetCode.arrayList;


/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 09:46 2018-11-26
 * @Modified By:
 **/
public class MajorityElement {


    /**
     * Description:
     * Given a array of size n,find the majority element.The majority element is the element that appears more
     * than n/2 times.
     * 给一个n位数组，找出其中的众数。众数是指在数组中出现次数大于n/2的元素
     * You may assume that the array is none-empty and the majority element always exists in the array.
     * 你可以假设数组是空的，并且给定的数组总是存在众数
     * Example:  Input: [3,2,3] Output: 3
     *          Input: [2,2,1,1,1,2,2] Output: 2
     * Help:
     * 首先定义一个majortiy和一个count，majority用来存放当前次数最多的数，
     * 如当majority等于第一个数后，count=1;
     * 然当majority与第二个数比较，如果相等count+1,否则count-1
     * 如果减到count=0的时候，则说明该数在出现的当前序列已经不是出现次数最多的数了，因此替换为当前的数
     * 然后继续比较下去。最后同样要对得出来的数进行校验
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int nums[]) {
        int half = nums.length / 2;
        int majority = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                majority = i;
                count++;
            } else {
                if (majority != i) {
                    count--;
                } else {
                    count++;
                }
            }
            if (count > half) {
                return majority;
            }
        }
        count = 0;
        for (int i : nums) {
            if (majority == i) {
                count++;
            }
        }
        if (count > half) {
            return majority;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 2};
        int result = majorityElement(data);
        System.out.println(result);

    }
}
