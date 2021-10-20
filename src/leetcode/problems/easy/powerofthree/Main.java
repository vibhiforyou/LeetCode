package leetcode.problems.easy.powerofthree;

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=1)
            return n==1;
        return n%3==0 && isPowerOfThree(n/3);
    }
}

public class Main {
    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(27));
        System.out.println(solution.isPowerOfThree(2147483647));

    }
}
