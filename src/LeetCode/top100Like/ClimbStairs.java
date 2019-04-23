package LeetCode.Top100Like;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 17:13 2019-1-3
 * @Modified By:
 **/
public class ClimbStairs {

    /**
     * You are climbing a stair case ;It takes n steps to reach to the top.Each time you can either climb 1 or 2 steps .In how
     * many distinct ways you can climb to the top ?
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        int[] f = new int[]{0, 1, 2};
        if (n < 3) return f[n];
        for (int i = 2; i < n; i++) {
            f[0] = f[1];
            f[1] = f[2];
            f[2] = f[0] + f[1];
        }
        return f[2];
    }

    public static void main(String args[]) {
        System.out.println(climbStairs(6));
    }
}
