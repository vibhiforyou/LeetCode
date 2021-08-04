package leetcode.problems.medium.longestPalindromicSubstring;

public class Solution2 {

    //Logic
    //example     b a b a d
    //            0 1 2 3 4
    //            i i+1
    // For Odd  :: consider ith element at center position and chech left and right same elements and claculate max palindrome substring
    // For Even ::consider ith ans i+1 element at center position and chech left and right same elements and claculate max palindrome substring
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";
        int n = s.length();
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int checkForOdd = checkforPalSubstring(s, i, i);
            int checkForEven = checkforPalSubstring(s, i, i + 1);

            int max = Math.max(checkForEven, checkForOdd);
            if (max > (end - start)) {
                start = i - (max - 1) / 2; //for odd
                end = i + max / 2;
            }
        }
        return s.substring(start, end+1);
    }

    public int checkforPalSubstring(String str, int start, int end) {
        int L = start, R = end;
        while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;

    }
}

class MainClasss {
    public static void main(String args[]) {
        String input = "cbbd";
        Solution2 solution = new Solution2();
        System.out.println(solution.longestPalindrome(input));
    }
}