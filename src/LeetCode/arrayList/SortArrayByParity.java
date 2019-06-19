package LeetCode.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: MinZhang
 * @desc: LeetCode 905
 * @date: Created in 15:31 2019-6-19
 * @Modified By:
 **/
public class SortArrayByParity {

    public static void main(String args[]) {
        int data[] = {3, 2, 5, 8, 1, 7, 12};
        System.out.println(Arrays.toString(sortArrayByParity(data)));
    }
    /**
     * @Description: 将一对数组奇偶分开排序并一起返回
     * Input: [3,1,2,4]
     * Output: [2,4,3,1]
     * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     * @Param:
     * @Return:
    **/
    public static int[] sortArrayByParity(int[] A) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenList.add(A[i]);
            } else {
                oddList.add(A[i]);
            }
        }
        evenList.addAll(oddList);
        int[] retArr = new int[A.length];
        for (int i = 0; i < evenList.size(); i++) {
            retArr[i] = evenList.get(i);
        }
        return retArr;
    }
}
