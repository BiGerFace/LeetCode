package LeetCode;

import java.util.Stack;

/**
 * @author MinZhang
 * @desc
 * @date: Created in 10:58 2018-11-7
 * @Modified By:
 **/
public class IsValid {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     */

    public static boolean isValid(String s) {
        if (null == s || s.trim().length() < 1 || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }
}
