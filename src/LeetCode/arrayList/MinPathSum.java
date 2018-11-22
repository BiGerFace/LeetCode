package LeetCode.arrayList;

import java.util.Arrays;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 15:27 2018-11-22
 * @Modified By:
 **/
public class MinPathSum {


    /**
     * Given a m x n grid filled with non-negative numbers,
     * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
     * Note: You can only move either down or right at any point in time
     * 动态规划求最小的路径和
     * For example:
     * Input:
     * [
     * [1,3,1],
     * [1,5,1],
     * [4,2,1]
     * ]
     * Output: 7
     * Explanation: Because the path 1→3→1→1→1 minimizes the sum
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int[] res = new int[colLen + 1];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[1] = 0;
        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j <= colLen; j++) {
                // 因為最小的路徑和為：從左邊和上邊選擇最小的路徑和再加上當前點，
                // res[j]沒更新之前就表示i-1行到第j行元素的最小路徑和
                // 因為是從左到右更新，res[j-1]表示i行第j-1個元素的最小路徑
                res[j] = Math.min(res[j], res[j - 1]) + grid[i - 1][j - 1];
            }
        }
        return res[colLen];
    }
}
