package leetcode.problems.medium.JumpGameII;

public class Solution {
    public static int jump(int[] nums) {
        int result=0;
        int l=0,r=0;
        while(r<nums.length-1){
            int farthest=0;
            for( int i=l;i<r+1;i++){
                farthest=Math.max(i+nums[i],farthest);
            }
            l=r+1;
            r=farthest;
            result++;
        }
        return result;
    }
}

class Main {
    public static void main(String args[]) {

        System.out.println(Solution.jump(new int[]{2,3,1,1,4}));
    }
}
