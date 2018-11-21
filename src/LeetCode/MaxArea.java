package LeetCode;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 16:43 2018-11-21
 * @Modified By:
 **/
public class MaxArea {

    /**
     *
     * Given n non-negative integers a1,a2,...,an,where each represents a point at coordinate (i,ai),n vertical lines
     * are drawn such that the two endpoints of line i is at (i,ai) and (i,0).Find two lines ,which together with x-axis
     * forms a container,such that the contains the most water.
     * Description: 给你N条垂直于X轴的直线，从中找两条直线和x轴组成一个桶装容器，使得这个容器容量最大
     *
     *
     * Example: Input:[1,8,6,2,5,4,8,3,7]
     *          Output:49
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int res = 0, i = 0, j = height.length - 1;
        while (i < j) {
            res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] data = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(data);
        System.out.println(result);

    }
}
