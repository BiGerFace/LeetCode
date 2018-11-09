package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: MinZhang
 * @desc: 将罗马书转为整数
 * @date: Created in 14:16 2018-11-9
 * @Modified By:
 **/
public class RomanToInt {

    /**
     * Example: Input : "III "  Output:3
     *          Input:"IV"      Output:4
     *          Input:"IX"      Output:9
     *          Input:"LVIII"   Output:58
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int length = s.length();
        int result = m.get(s.charAt(length - 1));
        for (int i = length - 2; i >= 0; i--) {
            if (m.get(s.charAt(i + 1)) <= m.get(s.charAt(i))) {
                result += m.get(s.charAt(i));
            } else {
                result += m.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = romanToInt("LVIII");
        System.out.println(result);

        String s = "Strings are immutable";
        char result2 = s.charAt(8);
        System.out.println(result2);
    }
}
