package leetcode.problems.easy.poweroftwo;
class Solution
{
    public boolean isPowerOfTwo(int n) {
        if(n<=1)
            return n==1;
        return n%2==0 && isPowerOfTwo(n/2);
    }
}
public class Main {
    public static void main(String... args){
        Solution solution= new Solution();
        System.out.println(solution.isPowerOfTwo(16));
    }
}
