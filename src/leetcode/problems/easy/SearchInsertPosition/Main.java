package leetcode.problems.easy.SearchInsertPosition;


class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int j = 0; j < n ; j++) {
            if (nums[j] >target) {
                return j;
            }
        }
        return nums.length;
    }
}

public class Main {
    public static void main(String... args) {
        int[] input = new int[]{1};
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(input, 0));
    }
}
