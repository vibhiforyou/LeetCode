package leetcode.problems.easy.validParentheses;

import java.util.Stack;
import java.util.stream.StreamSupport;

public class Solution {
    Stack<Character> stack= new Stack<>();
    public boolean isValid(String s) {
        boolean result=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' ||s.charAt(i)=='<' || s.charAt(i)=='[' ){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)=='}'){
                if(!stack.empty() &&stack.pop()=='{'){
                    result=true;
                }
                else
                {
                    result=false;
                    break;
                }
            } else if(s.charAt(i)==']'){
                if(!stack.empty() && stack.pop()=='['){
                    result=true;
                }
                else
                {
                    result=false;
                    break;
                }
            }else if(s.charAt(i)=='>'){
                if(!stack.empty() && stack.pop()=='<'){
                    result=true;
                }
                else
                {
                    result=false;
                    break;
                }
            }else if(s.charAt(i)==')'){
                if(!stack.empty() && stack.pop()=='('){
                    result=true;
                }
                else
                {
                    result=false;
                    break;
                }
            }
        }
        if(stack.empty()){
            return result;
        }
        else {
            return false;
        }
    }
}

class ValidParentheses {
    public static void main(String... args) {
        Solution solution = new Solution();
//        System.out.println(solution.isValid("()"));
//        System.out.println(solution.isValid("()[]{}"));
//        System.out.println(solution.isValid("(]"));
//        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("({{{{}}}))"));

    }
}