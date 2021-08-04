package leetcode.problems.medium.longestPalindromicSubstring;

public class Solution {
    int start = 0, end = 0;

    public String longestPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean result = isPallindrome(s, i, j);
                if (result) {
                    if ((end - start) < (j - i)) {
                        start = i;
                        end = j;
                    }
                }
            }
        }
        System.out.println(start);
        System.out.println(end);
        return s.substring(start, end+1);
    }

    public boolean isPallindrome(String str, int start, int end) {
        boolean flag = true;
        if ((end - start) > 0) {
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    flag = false;
                    break;
                } else {
                    start++;
                    end--;
                }
            }
        }
        return flag;
    }
}

class MainClass {
    public static void main(String args[]) {
        String input = "ac";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(input));
    }
}

