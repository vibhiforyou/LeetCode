package leetcode.problems.easy.validParentheses;

import java.util.Stack;

public class Solution2 {
    Stack<Character> stack = new Stack<>();
    boolean result = true;

    public boolean isValid(String s) {
        int strLen = s.length();
        for (int i = 0; i < strLen; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '<') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.empty()) {
                    result = compare(stack.pop(), s.charAt(i));
                } else {
                    result = false;
                }
                if (result == false)
                    break;
            }
        }
        if (result && stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compare(Character pop, Character s) {
        return ((pop == '{' && s == '}') || (pop == '[' && s == ']') || (pop == '<' && s == '>') || (pop == '(' && s == ')'));
    }
}

class validP {
    public static void main(String... args) {
        Solution2 solution2 = new Solution2();
//        System.out.println(solution2.isValid("()"));
//        System.out.println(solution2.isValid("()[]{}"));
//        System.out.println(solution2.isValid("(]"));
//        System.out.println(solution2.isValid("([)]"));
        System.out.println(solution2.isValid("({{{{}}}))"));
    }
}
