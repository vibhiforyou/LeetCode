package leetcode.problems.easy.MaximumSubarray;

class Solution{
    //Logic
    /*  consider we have -2,1,-3,4,-1,2,1,-5,4
    *   we start adding elements from left to right
    *   if sum < 0 we set sum to 0 again, and start adding remaining elements
    *   return sum
    * */

    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=0;

        for(int i=0;i<nums.length;i++){
            if(currentSum<0){
                currentSum=0;
            }
            currentSum+=nums[i];
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
public class Main {
    public static void main(String... args){
        Solution solution= new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(solution.maxSubArray(new int[]{1}));
        System.out.println(solution.maxSubArray(new int[]{5,4,-1,7,8}));

    }
}
