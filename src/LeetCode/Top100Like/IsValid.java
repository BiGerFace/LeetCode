package LeetCode.Top100Like;

import java.util.Stack;

/**
 * @author: MinZhang
 * @desc:
 * @date: Created in 16:35 2018-12-29
 * @Modified By:
 **/
public class IsValid {
    /**
     * Given a String containing just the characters '(' ,')' ,'{' ,'}','[' and ']',determine if the input string is valid .
     * An input String is valid if:
     * 1.open brackets must be closed by the same type of brackets .
     * 2.open brackets must be closed in the correct order.
     * Note that an empty string is also consider valid .
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            char candidate = s.charAt(i);
            if (candidate == '{' || candidate == '[' || candidate == '(') {
                stack.push(candidate + "");
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((candidate == '}' && stack.peek().equals("{")) || (candidate == ']' && stack.peek().equals("[")) || (candidate == ')' && stack.peek().equals("("))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(isValid("{}"));
    }


}
