package LeetCode.arrayList;

import java.util.Arrays;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 15:40 2018-11-22
 * @Modified By:
 **/
public class PlusOne {


    /**
     * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
     * 給一個由整數組成的非空數組所表示的非負整數，在該數基礎加一
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
     * 最高位數存放在數組的首位，數組中每個元素中存儲一個數字
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     * 你可以假設除了整數0之外，這個整數不會以0開頭
     * For example:
     * Input : [1,2,3]
     * OutPut:[1,2,4]
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] data = {9, 9, 9};
        int[] result = plusOne(data);
        System.out.println(Arrays.toString(result));

    }
}
