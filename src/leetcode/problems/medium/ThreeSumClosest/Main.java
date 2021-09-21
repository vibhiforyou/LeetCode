package leetcode.problems.medium.ThreeSumClosest;


import com.sun.source.tree.BreakTree;

import java.util.Arrays;

class Solution {
    //Logic runForLoop and kep two pointers
    //pointer one should start after first for loop and second pointer should start from last.
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return nums[i] + nums[l] + nums[r];
                }
                if (sum < target) {
                    l++;
                } else {
                    r--;
                }
                int localDiff = Math.abs(sum - target);

                if (localDiff < diff) {
                    diff = localDiff;
                    ans = sum;
                }
            }
        }

        return ans;
    }
}

public class Main {
    public static void main(String... args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(new int[]{1, 1, -1, -1, 3}, -1));
    }
}
