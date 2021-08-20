package leetcode.problems.easy.reverseNumber;

public class Solution {

    final int INT_MAX_LIMIT = 2147483647;
    final int INT_MIN_LIMIT = -2147483648;

    public int reverse(int x) {
        long reverseNumber = 0;
        if (x < INT_MIN_LIMIT || x > INT_MAX_LIMIT) {
            return 0;
        }

        while (x != 0) {
            int r = x % 10;

            reverseNumber = (reverseNumber * 10) + r;
            x = x / 10;
        }
        if(reverseNumber<INT_MIN_LIMIT || reverseNumber>INT_MAX_LIMIT)
        {
            return 0;
        }
        return (int)reverseNumber;

    }
}

class TestingSolution {
    public static void main(String... args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1534236469));
    }
}