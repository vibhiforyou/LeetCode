package leetcode.problems.easy.fibonaccinumber;

class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }


}

public class Main {
    public static void main(String... args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(2));
        System.out.println(solution.fib(9));
    }
}
