package LeetCode.Top100Like;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 17:02 2018-12-28
 * @Modified By:
 **/
public class NumJewelsInStones {
    /**
     * You're given Strings J representing the types of stones that are jewels, and S representing the stones you have.
     * Each character in S is a type of stone you have.You want to know how many of the stones you have are also jewels.
     * The letters in J are guaranteed  distinct  and all characters in J and S are letters .Letters are case sensitive ,
     * so "a" is considered a different of stone from "A".
     * 给你一个字符串J代表石头中不同类型的珠宝，S代表你拥有的石头。S中的每个字符代表石头中的一种类型。你需要知道石头中你有多少珠宝。
     * 此外，J中每个字母都是不一样的，并且在J、S中的所有元素都是字母。字母是区分大小写的，所以a和A是不一样的。即：在S中找出J的部分。
     * Example 1:
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     * Example 2:
     * Input: J = "z", S = "ZZ"
     * Output: 0
     * Conclude:利用String的toCharArray方法，将字符串转换为字符串数组。将J中元素分隔保存成数组，再和S中去对比。
     * @param J
     * @param S
     * @return
     */

    private static int numJewelsInStones(String J, String S) {
        char[] js = J.toCharArray();
        char[] ss = S.toCharArray();
        Set data = new HashSet();
        int ans = 0;
        for (char j : js) {
            data.add(j);
        }
        for (char s : ss) {
            if (data.contains(s))
                ans++;
        }
        return ans;
    }

    public static void main(String args[]) {
        String J = "aA";
        String S = "aAAbbb";
        int result = numJewelsInStones(J, S);
        System.out.println(result);
    }
}
