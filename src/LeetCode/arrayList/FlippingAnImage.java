package LeetCode.arrayList;

import java.util.Arrays;

/**
 * @author: MinZhang
 * @desc: LeetCode 832
 * @date: Created in 14:47 2019-6-18
 * @Modified By:
 **/
public class FlippingAnImage {

    /**
     * @Description:
     *   翻转图像并水平翻转图像并返回
     *   Input: [[1,1,0],[1,0,1],[0,0,0]]
     *   Output: [[1,0,0],[0,1,0],[1,1,1]]
     *   Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
     *   Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
     * @Param:
     * @Return:
    **/
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int k = 0; k < A.length; k++) {
            int i = 0;
            int j = A[k].length - 1;
            while (i <= j) {
                int temp = A[k][i];
                A[k][i] = (A[k][j] > 0) ? 0 : 1;
                A[k][j] = (temp > 0) ? 0 : 1;
                i++;
                j--;
            }
        }

        return A;
    }


    public static void main(String args[]) {
        int[][] a = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        Arrays.toString(flipAndInvertImage(a));
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
