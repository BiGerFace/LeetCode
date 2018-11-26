package LeetCode.arrayList;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 16:35 2018-11-22
 * @Modified By:
 **/
public class SetZeroes {

    /**
     * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
     * 给一个矩阵，如果一个元素是0，name她的整行或者整列都会变为0
     * Example:  Input:
     * [
     * [1,1,1],
     * [1,0,1],
     * [1,1,1]
     * ]
     * Output:
     * [
     * [1,0,1],
     * [0,0,0],
     * [1,0,1]
     * ]
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 || n == 0) {
            return;
        }
        int[] flagr = new int[m];
        int[] flagc = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    flagr[i] = 1;
                    flagc[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flagr[i] == 1 || flagc[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
