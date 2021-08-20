package leetcode.problems.easy.pallindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
//        String str = x + "";
//
//        int i = 0;
//        int j = str.length() - 1;

//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
        int reverseNumber = 0;
        int temp = x;
        while (x != 0) {
            int r = x % 10;
            reverseNumber = reverseNumber * 10 + r;
            x = x / 10;
        }
        return temp == reverseNumber ? true : false;
    }

}

class TestingPallindrome {
    public static void main(String... args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(121));
    }

}
